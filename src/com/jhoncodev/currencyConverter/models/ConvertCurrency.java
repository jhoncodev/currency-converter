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

    public void showInfoConverted(){
        System.out.println("Hello, this is the base currency: "+this.baseCurrency+" | this is the currency to convert: "+this.convertedCurrency);
        System.out.println("And this is base balance: "+this.baseBalance+" | and finally this is the converted balance: "+this.convertedBalance);
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
