package com.gokhanul.classes;

public class MethodOverloading {

    // Method overloading means having multiple methods with the same name but different parameters.
    // Differences can be: Number of parameters, type of parameters, order of parameters.
    // Java decides which method to call based on the arguments passed at compile time/
    // It's a form of compile-time polymorphism/
    // Method overloading allows one method name to handle similar actions with different input
    // variations.

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3
    double add(double a, double b) {
        return a + b;
    }
}
