package com.cofacademy.strings;

public class ManipulacionStrings {
    public static void main(String[] args) {
        System.out.println("==== METODOS DE INDEXACION ====");
        String s1 = "Hola Mundo";
        int longitud = s1.length();
        char c = s1.charAt(0);
        int index = s1.indexOf("o");
        String s2 = s1.substring(0,4);
        String s3 = s1.substring(4);
        System.out.println(longitud);
        System.out.println(c);
        System.out.println(index);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("==== METODOS DE MODIFICACION ====");
        String s4 = "Hola Mundo";
        String s5 = s1.concat(", bienvenidos a COF Academy");
        String s6 = s1.toLowerCase();
        String s7 = s1.toUpperCase();
        String s8 = s2.replace(" ", "_");
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);

        System.out.println("==== METODOS DE INSPECCION ====");
        String s9 = "Hola Mundo";
        System.out.println(s9.isEmpty());
        System.out.println(s9.contains("Hola"));
        System.out.println(s9.equals("cof academy"));
        System.out.println(s9.equalsIgnoreCase("hola mundo"));
    }
}
