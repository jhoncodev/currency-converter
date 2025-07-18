package com.jhoncodev.currencyConverter.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UseApi {
    public static void useExchangeRateApi(String baseCurrency, String currencyToConvert, float baseBalance){
        String url = "https://v6.exchangerate-api.com/v6/1cd360e86257c44390598400/pair/"+baseCurrency+"/"+currencyToConvert+"/"+baseBalance;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            ConvertJson.fromExchangeApi(json, baseCurrency, currencyToConvert, baseBalance);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
