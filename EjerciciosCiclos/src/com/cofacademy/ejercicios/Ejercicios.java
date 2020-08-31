package com.cofacademy.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

    public void obtenerPromedio() {
        /*
        Desarrollar un programa que obtenga el promedio
        de calificación de un alumno con 5 materias.
        - Solicitar y almacenar la información de las 5 materias
        - Sumar el total de las calificaciones
        - Obtener el promedio
        */
        float[] calificaciones = new float[5];
        Scanner sc = new Scanner(System.in);
        float suma = 0;
        float promedio = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingrese la calificacion " + (i + 1));
            calificaciones[i] = sc.nextFloat();
        }

        for (float f : calificaciones) {
            suma += f;  // suma = suma + f
        }

        promedio = suma / calificaciones.length;
        System.out.println("El promedio del alumno es: " + promedio);
    }

    public void adivinaNumero() {

        /*
        Desarrolle un programa que pida al usuario adivinar
        un número entre 0 y 10. El numero se debe generar aleatoriamente.
        El usuario tiene 3 intentos para adivinar el número.
        - Generar el numero random entre 0 y 10
        - Pedir al usuario que intente adivinar y validar si acerto
        - Validar el numero de intentos
        */
        Random r = new Random();
        int randNum = r.nextInt(11);
        Scanner sc = new Scanner(System.in);
        int userNum = -1;
        int intentos = 3;

        while (userNum != randNum) {
            System.out.println("Adivina el numero aleatorio entre 0 y 10:");
            userNum = sc.nextInt();
            if (userNum != randNum) {
                intentos--;     // intentos = intentos - 1
                System.out.println("Fallaste... intentos restantes: " + intentos);
                if (intentos == 0) {
                    System.out.println("Perdiste :c");
                    System.out.println("El numero aleatorio era: " + randNum);
                    break;
                }
            } else {
                System.out.println("Ganaste!");
            }

        }

    }
}
