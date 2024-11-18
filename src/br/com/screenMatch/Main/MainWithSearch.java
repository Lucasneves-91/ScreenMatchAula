package br.com.screenMatch.Main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite o nome do filme para busca: ");
        var search = read.nextLine();

        String apiKey = "12620e0f";
        String webAddress = "https://www.omdbapi.com/?t=" + search + "&apikey="+ apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(webAddress)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
