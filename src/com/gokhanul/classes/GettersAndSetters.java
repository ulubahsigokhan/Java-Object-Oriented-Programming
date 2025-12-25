package com.gokhanul.classes;

public class GettersAndSetters {

    // First we change the access modifier from public to private.
    // Only methods inside the same class can use it directly.
    private int baseSalary;
    private int hourlyRate;

    public int wageCal(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // SETTERS
    // A setter is a method used to set or update the value of a private variable from outside the class.
    // It's a core p;art of encapsulation, one of the main OOP principles.
    // They protect internal state by preventing direct access to variables.
    // They allow validation or rules before assigning a value.
    // They make your code easier to maintain and test.
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less!");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative!");
        this.hourlyRate = hourlyRate;
    }

    //----------------------------------------------------------------------------------------------------------

    // GETTERS
    // A getter is a method used to read or retrieve the value of a private variable.
    // It provides controlled access without allowing modification.
    // They expose data safely.
    // They allow read-only access when needed.
    // They support debugging, logging, and testing.
    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
