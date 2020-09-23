package com.example.modificadores;

public class Main{
    public static void main(String[] args) {
        double itemPrice = 10.0;
        TaxCalculator tc = new TaxCalculator();
        double itemTax = tc.getTaxAmount(itemPrice);
        System.out.println(itemTax);
    }
}