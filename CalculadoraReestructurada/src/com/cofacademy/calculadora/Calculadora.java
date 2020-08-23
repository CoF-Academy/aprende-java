package com.cofacademy.calculadora;

public class Calculadora {
    public float operacionSuma (float num1, float num2) {
        return num1 + num2;
    }

    public float operacionResta (float num1, float num2) {
        return num1-num2;
    }

    public float operacionMultiplicacion (float num1, float num2) {
        return num1 * num2;
    }

    public float operacionDivision (float num1, float num2) {
        return num1/num2;
    }

    public void menu() {
        System.out.println("Seleccione la operacion: ");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
    }
}
