package com.example.enums;

public class Main {


    public static void main(String[] args) {
        Level level = Level.HARD;

        switch (level) {
            case EASY:
                System.out.println("El nivel es facil");
                break;
            case NORMAL:
                System.out.println("El nivel es normal");
                break;
            case HARD:
                System.out.println("El nivel es dificil");
                break;
        }

    }
}
