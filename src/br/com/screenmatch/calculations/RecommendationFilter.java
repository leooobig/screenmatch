package br.com.screenmatch.calculations;

public class RecommendationFilter {
    public void filter(Classifiable classifiable){
        if (classifiable.getClassification() >= 4){
            System.out.println("Melhor avaliado");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Na média");
        }else {
            System.out.println("Pior avaliado");
        }
    }
}
