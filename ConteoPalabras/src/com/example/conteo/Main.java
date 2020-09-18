package com.example.conteo;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ConteoPalabras conteo = new ConteoPalabras();
        File file = new File("input.txt");
        String[] lines = conteo.readFile(file);
        int words = lines.length;
        boolean result = conteo.showResult(words, lines);
        if (result) {
            System.out.println("Todo salio bien :)");
        } else {
            System.out.println("Hubo un problema en la ejecucion :(");
        }
    }
}
