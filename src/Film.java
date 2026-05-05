public class Film {
    String name;
    int releaseYear;
    boolean incluedInPlan;
    double review;
    int totalReviews;
    int durationInMinutes;

    void showTechnicalSheet(){
        System.out.println("Nome: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }
}
