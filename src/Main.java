import br.com.screenmatch.calculations.TimeCalculator;
import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("Top Gun");
        myFilm.setReleaseYear(2002);
        myFilm.setDurationInMinutes(185);
        System.out.println("Duração do filme: " + myFilm.getDurationInMinutes());

        myFilm.showTechnicalSheet();
        myFilm.evaluate(10);
        myFilm.evaluate(10);
        myFilm.evaluate(8);
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

    }
}
