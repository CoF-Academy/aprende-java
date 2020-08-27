package com.cofacademy.ciclos;

public class Ciclos {
    public static void main(String[] args) {
        // While loop
        System.out.println("Ciclo while");
        int i = 0;
        while (i < 5) {
            System.out.println("El valor de i es: " + i);
            i++;    // i = i+1
        }
        System.out.println("Ciclo do while");
        i = 0;

        // Do while
        do {
            System.out.println("El valor de i es: " + i);
            i++;    // i = i+1
        } while (i < 5);

        // Ciclo for
        System.out.println("Ciclo for");
        String[] values = {"a", "bb", "ccc"};
        for (int j = 0; j < values.length; j++) {
            System.out.println(values[j]);
        }

        // Ciclo foreach
        System.out.println("Ciclo foreach");
        for (String str : values) {
            System.out.println(str);
        }


    }
}
