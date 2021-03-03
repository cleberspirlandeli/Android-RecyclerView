package com.example.recyclerview.model;

public class Filme {
    private String Titulo;
    private String Ano;
    private String Genero;

    public Filme() {
    }

    public Filme(String titulo, String ano, String genero) {
        Titulo = titulo;
        Ano = ano;
        Genero = genero;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
