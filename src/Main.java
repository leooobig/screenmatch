import br.com.screenmatch.calculations.RecommendationFilter;
import br.com.screenmatch.calculations.TimeCalculator;
import br.com.screenmatch.models.Episode;
import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Serie;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("Top Gun");
        myFilm.setReleaseYear(2002);
        myFilm.setDurationInMinutes(185);
        System.out.println("Duração do filme: " + myFilm.getDurationInMinutes());

        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.evaluate(9);
        System.out.println("Total de avaliações: " + myFilm.getTotalEvaluations());
        System.out.println(myFilm.getAvarage());

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includ(myFilm);

        Film myFilm2 = new Film();
        myFilm2.setName("Avatar");
        myFilm2.setReleaseYear(2000);
        myFilm2.setDurationInMinutes(135);
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

        Film myFilm3 = new Film();
        myFilm3.setName("Dogville");
        myFilm3.setDurationInMinutes(200);
        myFilm3.setReleaseYear(2003);
        myFilm3.evaluate(10);

        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(myFilm);
        filmList.add(myFilm2);
        filmList.add(myFilm3);
        System.out.println("Tamanho da lista: " + filmList.size());
        System.out.println("Primeiro filme: " + filmList.get(0).getName());

        for (int i = 0; i < filmList.size(); i++) {
            System.out.println((i+1) + " "+ filmList.get(i).getName());
        }
    }
}
