package br.com.alura.screenmatch.principal;

import br.com.alura.screenmach.modelos.Filme;
import br.com.alura.screenmach.modelos.Serie;
import br.com.alura.screenmach.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O pederoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme && filmeDoPaulo.getClassificacao() > 2) {
                Filme filme = (Filme) item;
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }

        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);

        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);

        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.avalia(8);

        ArrayList<Titulo> lista1 = new ArrayList<>();
        lista1.add(favorito);
        lista1.add(outro);
        lista1.add(serie);

        for (Titulo item : lista1) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());


            }

            ArrayList<String> buscaPorArtista = new ArrayList<>();
            buscaPorArtista.add("Adam Sandler");
            buscaPorArtista.add("Paulo");
            buscaPorArtista.add("Jacqueline");
            System.out.println(buscaPorArtista);

            Collections.sort(buscaPorArtista);
            System.out.println("Depois da ordenação");
            System.out.println(buscaPorArtista);
            System.out.println("Lista de títulos ordenados");
            Collections.sort(lista);
            System.out.println(lista);
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            System.out.println("Ordenando por ano");
            System.out.println(lista);

        }

    }

}