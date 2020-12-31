package com.cofacademy.example;

public class Main {
    public static void main(String[] args) {
        EnglishLanguage english = new EnglishLanguage();
        ProgrammingLanguage pl = new ProgrammingLanguage();
        english.sayHi();
        english.sayBye();
        pl.sayHi();
        pl.sayBye();
    }
}
