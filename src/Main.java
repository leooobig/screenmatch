public class Main {
    public static void main(String[] args) {
        Film myFilme = new Film();
        myFilme.name = "Top Gun";
        myFilme.releaseYear = 2002;
        myFilme.durationInMinutes = 185;

        myFilme.showTechnicalSheet();
    }
}