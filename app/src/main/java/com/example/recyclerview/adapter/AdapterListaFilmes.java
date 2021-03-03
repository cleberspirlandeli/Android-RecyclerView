package com.example.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.Filme;

import java.util.List;

public class AdapterListaFilmes extends RecyclerView.Adapter<ViewHolderListaFilmes> {

    private List<Filme> filmes;

    public AdapterListaFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    @NonNull
    @Override
    public ViewHolderListaFilmes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new ViewHolderListaFilmes(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderListaFilmes holder, int position) {

        Filme filme = filmes.get(position);

        holder.titulo.setText(filme.getTitulo());
        holder.ano.setText(filme.getAno());
        holder.genero.setText(filme.getGenero());

//        holder.linearLayoutMain.setOnClickListener();
    }

    @Override
    public int getItemCount() {
        return this.filmes.size();
    }

}

class ViewHolderListaFilmes extends RecyclerView.ViewHolder {

    TextView titulo, ano, genero;
//    LinearLayout linearLayoutMain;

    public ViewHolderListaFilmes(@NonNull View itemView) {
        super(itemView);

        titulo = itemView.findViewById(R.id.txt_titulo);
        ano = itemView.findViewById(R.id.txt_ano);
        genero = itemView.findViewById(R.id.txt_genero);
//        linearLayoutMain = itemView.findViewById(R.id.linearLayoutMain);
    }
}
