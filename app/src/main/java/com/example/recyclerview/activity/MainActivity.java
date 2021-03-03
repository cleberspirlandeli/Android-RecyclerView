package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerview.R;
import com.example.recyclerview.RecyclerItemClickListener;
import com.example.recyclerview.adapter.AdapterListaFilmes;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager  mLayoutManager;
    private List<Filme> filmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Criar Lista
        this.CriarFilmes();

        // Configurar Adapter
        AdapterListaFilmes adapterListaFilmes = new AdapterListaFilmes(this.filmes);

        // Configurar RecyclerView
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapterListaFilmes);

        // Evento de Click
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Filme filme = filmes.get(position);

                                Toast.makeText(MainActivity.this, filme.getTitulo(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Toast.makeText(MainActivity.this, "Clique longo", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            }
                        }
                )
        );
    }

    public void CriarFilmes() {
        Filme filme = new Filme("A dois", "2014", "Romance");
        this.filmes.add(filme);

        filme = new Filme("Como eu era antes de voce", "2015", "Romance");
        this.filmes.add(filme);

        filme = new Filme("Homem Aranha", "2005", "Aventura");
        this.filmes.add(filme);

        filme = new Filme("Mulher Maravilha", "2018", "Aventura");
        this.filmes.add(filme);

        filme = new Filme("Capitao America", "2017", "Aventura");
        this.filmes.add(filme);

        filme = new Filme("IT: A coisa 1", "2015", "Terror");
        this.filmes.add(filme);

        filme = new Filme("IT: A coisa 2", "2017", "Terror");
        this.filmes.add(filme);

        filme = new Filme("IT: A coisa 3", "2019", "Terror");
        this.filmes.add(filme);

        filme = new Filme("Velozes e Furiosos 1", "2002", "Carro");
        this.filmes.add(filme);

        filme = new Filme("Velozes e Furiosos 2", "2004", "Carro");
        this.filmes.add(filme);

        filme = new Filme("Velozes e Furiosos 3 - Desafio em Tokyo", "2006", "Carro");
        this.filmes.add(filme);

        filme = new Filme("Velozes e Furiosos 4", "2008", "Carro");
        this.filmes.add(filme);

        filme = new Filme("Velozes e Furiosos 5 - O Retorno", "2010", "Carro");
        this.filmes.add(filme);

        filme = new Filme("Meu Malvado Favorito 3", "2017", "Comedia");
        this.filmes.add(filme);

        filme = new Filme("Carros 3", "2017", "Comedia");
        this.filmes.add(filme);
    }
}