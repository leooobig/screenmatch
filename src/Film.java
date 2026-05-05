public class Film {
    String name;
    int releaseYear;
    boolean incluedInPlan;
    double sumEvaluations;
    int totalEvaluations;
    int durationInMinutes;

    void showTechnicalSheet(){
        System.out.println("Nome: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }

    void evaluate(double note){
        sumEvaluations += note;
        totalEvaluations ++;
    }

    double getAvarage(){
        return sumEvaluations / totalEvaluations;
    }
}
