package br.com.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import io.github.cdimascio.dotenv.Dotenv;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("API_KEY");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um filme para pesquisar: ");
        var filmSearch = scanner.nextLine();
        var treatedFilmSearch = filmSearch.trim().replace(" ", "+");
        String url = "https://www.omdbapi.com/?t="+treatedFilmSearch+"&apikey="+apiKey;
        System.out.println(treatedFilmSearch);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)).build();
        HttpResponse<String> reponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(reponse.body());
    }
}
