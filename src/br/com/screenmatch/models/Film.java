package br.com.screenmatch.models;
import br.com.screenmatch.calculations.Classifiable;

public class Film extends Tittle implements Classifiable {
    private String director;

    public Film(String name, int releaseYear, int minutes){
        this.setName(name);
        this.setReleaseYear(releaseYear);
        this.setDurationInMinutes(minutes);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAvarage() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
