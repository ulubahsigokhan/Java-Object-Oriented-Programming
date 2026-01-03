package com.gokhanul.classes;

public class Inheritance {

    /*
    Inheritance allows one class (child/subclasses) to reuse fields and methods of another class
    (parent/superclasses). It represents an "is-a" relationship.
     */
}

class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    int year;

    void drive() {
        System.out.println("Car is driving");
    }
}
