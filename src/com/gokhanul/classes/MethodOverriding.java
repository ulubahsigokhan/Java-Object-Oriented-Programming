package com.gokhanul.classes;

public class MethodOverriding {

    // Method overriding happens when a child class provides its own implementation of a method that
    // already exists in the parent class.
    // Method overriding allows different behavior for the same method call, depending on the object type.
    // Method name and the parameters must be the same.
    // Inheritance (extends) is required. Happens at runtime (polymorphism).
    // Usually marked with @Override.
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


