package com.cofacademy.principal;

import com.cofacademy.calculadora.Calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("*** CALCULADORA ***");
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextFloat();

        Calculadora cal = new Calculadora();
        cal.menu();

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                // suma
                System.out.println("El resultado es: " + cal.operacionSuma(num1, num2));
                break;
            case 2:
                // resta
                System.out.println("El resultado es: " + cal.operacionResta(num1, num2));
                break;
            case 3:
                // mult
                System.out.println("El resultado es: " + cal.operacionMultiplicacion(num1, num2));
                break;
            case 4:
                // div
                if (num2 == 0) {
                    System.out.println("No es posible dividir entre cero");
                } else {
                    System.out.println("El resultado es: " + cal.operacionDivision(num1, num2));
                }
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
}
