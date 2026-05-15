import br.com.screenmatch.calculations.RecommendationFilter;
import br.com.screenmatch.calculations.TimeCalculator;
import br.com.screenmatch.models.Episode;
import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Serie;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("Top Gun", 2002, 185);
        System.out.println("Duração do filme: " + myFilm.getDurationInMinutes());

        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.evaluate(9);
        System.out.println("Total de avaliações: " + myFilm.getTotalEvaluations());
        System.out.println(myFilm.getAvarage());

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includ(myFilm);

        Film myFilm2 = new Film("Avatar", 2000, 135);
        System.out.println("Duração do filme: " + myFilm2.getDurationInMinutes());
        timeCalculator.includ(myFilm2);


        Serie mySerie = new Serie();
        mySerie.setName("Vikings");
        mySerie.setReleaseYear(2000);
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

        Film myFilm3 = new Film("Dogville", 200, 2003);
        myFilm3.evaluate(10);

        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(myFilm);
        filmList.add(myFilm2);
        filmList.add(myFilm3);
        System.out.println("Tamanho da lista: " + filmList.size());
        System.out.println("Primeiro filme: " + filmList.get(0).getName());
        System.out.println(filmList);

        for (int i = 0; i < filmList.size(); i++) {
            System.out.println(filmList.get(i).toString());
        }
    }
}
