package com.cofacademy.main;

import com.cofacademy.filemanager.ManipulacionArchivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ManipulacionArchivos manipulacionArchivos = new ManipulacionArchivos();
        Scanner sc = new Scanner(System.in);
        String fileName = "archivo.txt";

        int opcion = -1;
        while (opcion != 4) {
            System.out.println("Selecciona la opcion: ");
            System.out.println("1) Crear archivo");
            System.out.println("2) Leer archivo");
            System.out.println("3) Borrar Archivo");
            System.out.println("4) Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    manipulacionArchivos.createFile(fileName);
                    break;
                case 2:
                    manipulacionArchivos.readFile(fileName);
                    break;
                case 3:
                    manipulacionArchivos.deleteFile(fileName);
                    break;
                case 4:
                    System.out.println("Adios! :)");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
        }

    }
}
