package com.jhoncodev.currencyConverter.models;

public class ConvertCurrency {
    private String baseCurrency;
    private String convertedCurrency;
    private float baseBalance;
    private float convertedBalance;

    public ConvertCurrency(CurrencyExhangeAPI currencyExhangeAPI, String baseCurrency, String currencyToConvert, float baseBalance){
        this.convertedBalance = currencyExhangeAPI.conversion_result();
        this.baseCurrency = baseCurrency;
        this.convertedCurrency = currencyToConvert;
        this.baseBalance = baseBalance;
    }

    public void showInfoToUser(){
        System.out.println("The value "+this.baseBalance +" ["+this.baseCurrency+"]"+" corresponds to the final value =>> "+this.convertedBalance+" ["+this.convertedCurrency+"]");
    }

    @Override
    public String toString() {
        return "ConvertCurrency{" +
                "baseCurrency='" + baseCurrency + '\'' +
                ", convertedCurrency='" + convertedCurrency + '\'' +
                ", baseBalance=" + baseBalance +
                ", convertedBalance=" + convertedBalance +
                '}';
    }
}
