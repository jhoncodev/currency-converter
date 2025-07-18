package com.jhoncodev.currencyConverter.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertJson {
    public static void fromExchangeApi(String json, String baseCurrency, String currencyToConvert, float baseBalance){
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            CurrencyExhangeAPI currencyExhangeAPI = gson.fromJson(json, CurrencyExhangeAPI.class);

            ConvertCurrency convertedCurrency = new ConvertCurrency(currencyExhangeAPI, baseCurrency, currencyToConvert, baseBalance);
            convertedCurrency.showInfoToUser();

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
