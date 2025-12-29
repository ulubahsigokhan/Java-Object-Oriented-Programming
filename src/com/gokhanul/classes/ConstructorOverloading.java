package com.gokhanul.classes;

public class ConstructorOverloading {

    // Constructor overloading means having multiple constructors in the same class with different parameters.
    // Each constructor can initialize the object in a different way.
    // It allows flexibility when creating objects depending on what information is available at creation time.
    // Is like having multiple ways to build the same object.

    String brand;
    int year;
    String color;

    // Constructor 1 - no parameters (default style)
    ConstructorOverloading() {
        this.brand = "Unknown";
        this.year = 0;
        this.color = "Not specified";
    }

    // Constructor 2 - only brand
    ConstructorOverloading(String brand) {
        this.brand = brand;
        this.year = 2024;       // default year if not provided
        this.color = "Black";   // default color
    }

    // Constructor 3 - brand & year
    ConstructorOverloading(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.color = "Black";   // default color
    }

    // Constructor 4 - all data
    ConstructorOverloading(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }
}
