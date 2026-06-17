package br.com.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import br.com.screenmatch.models.OmdbTittle;
import br.com.screenmatch.models.Tittle;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

        String json = reponse.body();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        OmdbTittle omdbTittle = gson.fromJson(json, OmdbTittle.class);
        Tittle myTittle = new Tittle(omdbTittle);
        System.out.println(myTittle);

    }
}
