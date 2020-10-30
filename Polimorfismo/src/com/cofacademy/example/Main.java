package com.cofacademy.example;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        for(Animal a : animals){
            a.eat();
        }

    }
}
