package br.com.screenMatch.Main;

import br.com.screenMatch.Exception.YearConversionErrorException;
import br.com.screenMatch.models.OmdbTitle;
import br.com.screenMatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        String webAddress = "https://www.omdbapi.com/?t=" + search.replace(" ","+") + "&apikey="+ apiKey;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(webAddress))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            OmdbTitle MyTitleOmdb = gson.fromJson(json, OmdbTitle.class);
            System.out.println(MyTitleOmdb);
            Title myTitulo = new Title(MyTitleOmdb);
            System.out.println("Titulo já convertido");
            System.out.println(myTitulo);

        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
        System.out.println("Algum erro de argumento na busca, verifique o endereço");

        } catch (YearConversionErrorException e) {
        System.out.println(e.getMessage());
        }
        System.out.println("O programa finalizou corretamente!");





    }
}
