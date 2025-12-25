package com.gokhanul.classes;

public class Abstraction {

    // Abstraction is about focussing on essential features and ignoring unnecessary details.
    // You interact with an object by what it can do, without worrying  about how it does it internally.
    // Why we use Abstraction:
    // Reduces complexity (you don't need to know how everything works internally)
    // Improves maintainability(changes inside a class don't affect outside code)
    // Support loose coupling (indirect connection between objects)
    // Allows multiple implementation using the same contract, etc (e.g., different engines for a car,
    // different payment gateway, etc.)
    // Form the backbone of designing frameworks, APIs, and automation frameworks)
    public abstract class Payment {
        abstract void pay(int amount); // what it does
        // how it does is decided in child classes

    }

    public class CreditCardPayment extends Payment {
        void pay(int amount) {
            System.out.println("Paid $" + amount + " using Credit Card");
        }
    }

    public class PaypalPayment extends Payment {
        void pay(int amount) {
            System.out.println("Paid $" + amount + "using PayPal");
        }
    }

}
