package com.example.modificadores;

public class TaxCalculator {
    double rate = 0.1;

    double getTaxAmount(double price) {
        return rate * price;
    }
}