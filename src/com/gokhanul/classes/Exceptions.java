package com.gokhanul.classes;

public class Exceptions {

    public static void main(String[] args) {
        // An Exception is an unexpected event that occurs during program execution and disrupts the normal
        // flow of the program.
        // Java Exceptions help you detect errors, prevent application crashes, handle failures gracefully.

        // NullPointerException
        // Cause: Using an object reference that is null
        // Example:
        String name = null;
        System.out.println(name.length());

        //-------------------------------------------------------------------------------------------------

        // ArrayIndexOutOfBoundsException
        // Cause: Accessing an invalid index in an array
        // Example:
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);

        //-------------------------------------------------------------------------------------------------

        // ArithmeticException
        // Cause: Illegal math operation (most often division by zero)
        // Example:
        int result = 10 / 0;

        //-------------------------------------------------------------------------------------------------

        // NumberFormatException
        // Cause: Converting a non-numeric string into a number
        // Example:
        int num = Integer.parseInt("abc");

        //-------------------------------------------------------------------------------------------------

        // ClassCastException
        // Cause: Invalid object casting
        // Example:
        Object obj = "Hello";
        Integer num1 = (Integer) obj;

        //-------------------------------------------------------------------------------------------------

        // IllegalArgumentException
        // Cause: Passing invalid arguments to a method
        // Example:
        // public static void setAge(int age) {
        //    if (age < 0) {
        //        throw new IllegalArgumentException("Age cannot be negative");
        //    }
        // }

        //-------------------------------------------------------------------------------------------------

        // TRY-CATCH-FINALLY
        // try-catch-finally is used to handle exceptions safely and ensure certain code always executes,
        // whether an error occurs or not.
        /*
        public class TryCatchFinallyExample {

            public static void main(String[] args) {
                try {
                    int result = 10 / 0;   // risky code
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero");
                } finally {
                    System.out.println("Finally block executed");
                }
                System.out.println("Program continues...");
            }
        }

         */


    }


}
