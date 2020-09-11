package com.cofacademy.filemanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulacionArchivos {

    public void createFile(String fileName) {
        System.out.println("=== Creando el archivo " + fileName + " ===");
        boolean fileCreated = false;
        File file = new File(fileName);
        try {
            fileCreated = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Aprendiendo a manejar archivos");
            fileWriter.close();
            if(fileCreated) {
                System.out.println("=== El archivo se creo correctamente ===");
            } else {
                System.out.println("=== El archivo ya existe ===");
            }
        } catch (IOException e) {
            System.out.println("=== Excepcion al crear el archivo " + e);
        }
    }

    public void readFile(String fileName) {
        System.out.println("=== Leyendo el archivo " + fileName + " ===");
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" === Hubo un error al abrir el archivo " + e);
        }
    }

    public void deleteFile(String fileName) {
        System.out.println("=== Borrando el archivo " + fileName + " ===");
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("=== El archivo se borro correctamente ===");
        } else {
            System.out.println("=== No se pudo borrar el archivo ===");
        }
    }
}
