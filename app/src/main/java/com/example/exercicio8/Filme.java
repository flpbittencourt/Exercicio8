package com.example.exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Filme {

    public String nome;
    public int img;

    public int ano;

    public Filme(String nome, int img, int ano){
        this.nome = nome;
        this.img = img;
        this.ano = ano;
    }

    public static List<Filme> getFilmes() {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Veloses e Furiosos 1", R.drawable.velozes_e_furiosos_1, 2001));
        filmes.add(new Filme("Veloses e Furiosos 3", R.drawable.velozes_e_furiosos_3, 2006));
        filmes.add(new Filme("Veloses e Furiosos 4", R.drawable.velozes_e_furiosos_4, 2009));
        filmes.add(new Filme("Veloses e Furiosos 5", R.drawable.velozes_e_furiosos_5, 2011));
        filmes.add(new Filme("Veloses e Furiosos 6", R.drawable.velozes_e_furiosos_6, 2013));
        filmes.add(new Filme("Veloses e Furiosos 7", R.drawable.velozes_e_furiosos_7, 2015));
        filmes.add(new Filme("Veloses e Furiosos 8", R.drawable.velozes_e_furiosos_8, 2017));
        filmes.add(new Filme("Veloses e Furiosos 9", R.drawable.velozes_e_furiosos_9, 2021));
        filmes.add(new Filme("Veloses e Furiosos 10", R.drawable.velozes_e_furiosos_10, 2023));

        return filmes;
    }

}
