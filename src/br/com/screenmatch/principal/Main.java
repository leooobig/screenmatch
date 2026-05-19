package br.com.screenmatch.principal;

import br.com.screenmatch.calculations.RecommendationFilter;
import br.com.screenmatch.calculations.TimeCalculator;
import br.com.screenmatch.models.Episode;
import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Serie;
import br.com.screenmatch.models.Tittle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("Top Gun", 2002);
        myFilm.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myFilm.getDurationInMinutes());

        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.evaluate(9);
        System.out.println("Total de avaliações: " + myFilm.getTotalEvaluations());
        System.out.println(myFilm.getAvarage());

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includ(myFilm);

        Film myFilm2 = new Film("Avatar", 1992);
        myFilm2.setDurationInMinutes(135);
        System.out.println("Duração do filme: " + myFilm2.getDurationInMinutes());
        timeCalculator.includ(myFilm2);


        Serie mySerie = new Serie("Vikings",2006);
        mySerie.showTechnicalSheet();
        mySerie.setSeasons(10);
        mySerie.setEpisodesBySeason(10);
        mySerie.setMinutesBySeason(50);
        System.out.println("Duração da série: " + mySerie.getDurationInMinutes() + " minutos");
        timeCalculator.includ(mySerie);

        System.out.println("Duração da maratona dos Filmes/Séries: " + timeCalculator.getTotalTime());

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(myFilm);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(mySerie);
        episode.setTotalPreview(50);
        recommendationFilter.filter(episode);

        Film myFilm3 = new Film("Dogville", 2003);
        myFilm3.setDurationInMinutes(200);
        myFilm3.evaluate(10);

        List<Tittle> tittleList = new ArrayList<>();
        tittleList.add(myFilm);
        tittleList.add(myFilm2);
        tittleList.add(myFilm3);
        tittleList.add(mySerie);
        System.out.println("Tamanho da lista: " + tittleList.size());
        System.out.println("Primeiro filme: " + tittleList.get(0).getName());
        for(Tittle tittle : tittleList){
            System.out.println(tittle);
        }

        //Ordenando lista pelo nome (metodo compareTo na class Tittle)
        System.out.println("Comparando por nome:");
        Collections.sort(tittleList);
        System.out.println(tittleList);
        System.out.println("Comparando por ano de lançamento:");
        tittleList.sort(Comparator.comparing(Tittle::getReleaseYear));
        System.out.println(tittleList);
    }
}
