package com.gokhanul.classes;

public class Employee {

    // Benefits of Object-Oriented Programming (OOP) Compared to Procedural Programming
    // Procedural programming focuses on functions and step-by-step instructions, while Object-Oriented Programming (OOP) focuses on objects that represent real-world entities. OOP provides several important advantages that make software easier to build, maintain, and scale.
    // 1. Better Code Organization
    // In OOP, code is organized into classes and objects, each responsible for a specific piece of behavior. This makes the project structure clearer and easier to navigate.
    // In procedural programming, logic is often spread across many functions, which can become hard to manage as the project grows.
    // 2. Reusability
    // OOP allows you to reuse code through classes, inheritance, and composition. Once a class is written, it can be reused in multiple parts of the application or extended for new features.
    // Procedural code usually requires copying and modifying functions, increasing duplication.
    // 3. Easier Maintenance and Refactoring
    // Changes in OOP can often be made inside a single class without affecting the rest of the system.
    // In procedural programming, changing one function may require updates in many places where that function is used.
    // 4. Encapsulation and Data Protection
    // OOP uses encapsulation to hide internal data and expose only what is necessary. This reduces bugs and prevents unintended changes to data.
    // Procedural programming typically relies on shared data, which can be modified from many places, increasing risk.
    // 5. Real-World Modeling
    // OOP closely matches how we think about real-world systems by modeling entities as objects with state and behavior.
    // Procedural programming focuses more on execution flow than real-world representation.
    // 6. Scalability
    // OOP makes it easier to scale applications by adding new classes or extending existing ones without rewriting large parts of the codebase.
    // Procedural programs become harder to scale as complexity increases.
    // 7. Improved Collaboration
    // In team environments, OOP allows developers to work on separate classes independently, reducing conflicts.
    // Procedural codebases often require more coordination due to shared logic and data.

    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
