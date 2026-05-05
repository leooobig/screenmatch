public class Main {
    public static void main(String[] args) {
        Film myFilme = new Film();
        myFilme.name = "Top Gun";
        myFilme.releaseYear = 2002;
        myFilme.durationInMinutes = 185;

        myFilme.showTechnicalSheet();
        myFilme.evaluate(10);
        myFilme.evaluate(10);
        myFilme.evaluate(8);
        System.out.println(myFilme.sumEvaluations);
        System.out.println(myFilme.totalEvaluations);
        System.out.println(myFilme.getAvarage());
    }
}