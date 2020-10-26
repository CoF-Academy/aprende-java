package com.cofacademy.example;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Peter", 25, 1000, "Google");
        Student st = new Student("Alex", 16, 9.5, "IPN");
        dev.showInfo();
        System.out.println("*********");
        st.showInfo();
    }
}
