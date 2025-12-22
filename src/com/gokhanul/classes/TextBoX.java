package com.gokhanul.classes;

public class TextBoX {

    // A class in java is a blueprint that defines what an object is and what it can do.
    // It groups data (variables) and behavior (methods) into one logical unit.
    // A class itself is not a real thing you can use directly; it describes how
    // objects should be created. Think of a class as a template, not the finished product.
    // To create a class , you use the class keyword followed by a name.
    // The class name should always start with a capital letter and match the file name.
    // Classes help us organize code so it doesn't become messy or repetitive.
    // They allow us to reuse logic instead of rewriting the same logic again.
    // Classes make programs easier to read, maintain, and expand.
    // They are the foundation of Object-Oriented Programming, which Java is built on.
    // Example:

    public String text = "";  // Field

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
