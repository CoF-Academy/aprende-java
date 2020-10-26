package com.cofacademy.example;

public class Student extends Person {
    private double score;
    private String school;

    public Student(String name, int age, double score, String school) {
        super(name, age);
        this.score = score;
        this.school = school;
    }

    public void showInfo() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge() +
                "\nScore: " + score + "\nSchool: " + school);
    }

}
