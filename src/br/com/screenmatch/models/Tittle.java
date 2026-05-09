package br.com.screenmatch.models;
import br.com.screenmatch.calculations.Classifiable;

public class Tittle implements Classifiable {
    private String name;
    private int releaseYear;
    private boolean incluedInPlan;
    private double sumEvaluations;
    private int totalEvaluations;
    private int durationInMinutes;
    private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncluedInPlan(boolean incluedInPlan) {
        this.incluedInPlan = incluedInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncluedInPlan() {
        return incluedInPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalEvaluations(){
        return totalEvaluations;
    }

    public double getAvarage(){
        return sumEvaluations / totalEvaluations;
    }

    public void showTechnicalSheet(){
        System.out.println("Nome: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }

    public void evaluate(double note){
        sumEvaluations += note;
        totalEvaluations ++;
    }

    @Override
    public int getClassification() {
        return 0;
    }
}
