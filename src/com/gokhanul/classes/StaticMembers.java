package com.gokhanul.classes;

public class StaticMembers {

    // Static members belong to the class itself rather than individual objects.
    // You don't share the same static value.
    // All objects share the same static value.
    // Useful for constants, utility methods, counters,m and shared data.

}

class Student {
        //Example:
        // static variable (shared by all students)
        static String schoolName = "Tech Academy";

        // instance variables (unique per student)
        String name;
        int grade;

        // Constructor
        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        // static method
        static void printSchool() {
            System.out.println("School; " + schoolName);
        }
}
