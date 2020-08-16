package com.cofacademy.example;

import com.cofacademy.example.model.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona alumno1 = new Persona("Eduardo", 30, "Calle 1");
        Persona alumno2 = new Persona("Sofia", 25, "Calle 25");

        System.out.println(alumno1.nombre);
        System.out.println(alumno1.edad);
        System.out.println(alumno1.direccion);

        System.out.println(alumno2.nombre);
        System.out.println(alumno2.edad);
        System.out.println(alumno2.direccion);

    }
}
