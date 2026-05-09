package br.com.screenmatch.models;
import br.com.screenmatch.calculations.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Serie serie;
    private int totalPreview;

    public int getTotalPreview() {
        return totalPreview;
    }

    public int getNumber() {
        return number;
    }

    public Serie getSerie() {
        return serie;
    }

    public String getName() {
        return name;
    }

    public void setTotalPreview(int totalPreview) {
        this.totalPreview = totalPreview;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (getTotalPreview() >= 100){
            return 4;
        } else if (getTotalPreview() >= 50) {
            return 2;
        } else{
            return 1;
        }
    }
}
