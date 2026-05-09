package br.com.screenmatch.models;
import br.com.screenmatch.calculations.Classifiable;

public class Film extends Tittle implements Classifiable {
    private String director;

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
}
