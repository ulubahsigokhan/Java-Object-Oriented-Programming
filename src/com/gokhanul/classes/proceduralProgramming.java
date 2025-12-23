package com.gokhanul.classes;

public class proceduralProgramming {

    // With this procedural programming example we will compare it with OOP to see the benefits of OOP

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + (extraHours * hourlyRate);
    }
}

