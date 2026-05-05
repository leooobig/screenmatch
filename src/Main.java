public class Main {
    public static void main(String[] args) {
        Film myFilme = new Film();
        myFilme.nome = "Top Gun";
        myFilme.anoDeLancamento = 2002;
        myFilme.duracaoEmMinutos = 185;

        System.out.println(myFilme.nome);
        System.out.println(myFilme.anoDeLancamento);
    }
}