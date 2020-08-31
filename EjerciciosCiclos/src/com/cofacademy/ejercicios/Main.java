package com.cofacademy.ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el ejercicio que quieres ejecutar: ");
        System.out.println("1) Obtener Promedio");
        System.out.println("2) Adivinar Numero");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicios.obtenerPromedio();
                break;
            case 2:
                ejercicios.adivinaNumero();
            default:
                System.out.println("Elige una opcion correcta");
        }

    }
}
