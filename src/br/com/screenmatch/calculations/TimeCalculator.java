package br.com.screenmatch.calculations;

import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Serie;
import br.com.screenmatch.models.Tittle;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void includ(Film f){
//        totalTime += f.getDurationInMinutes();
//    }
//
//    public void includ(Serie s){
//        totalTime += s.getDurationInMinutes();
//    }
//
    public void includ(Tittle t){
        this.totalTime += t.getDurationInMinutes();
    }
}
