package com.javaj2ee.datatypes;

public class MathsClassOperations {
    public static void main(String[] args){
        int a = -5;
        int b = 3;
        double c = 2.5;
        double d = 4.0;
        System.out.println("Absolute value of a: " + Math.abs(a));
        System.out.println("Maximum of a and b: " + Math.max(a, b));
        System.out.println("Minimum of a and b: " + Math.min(a, b));
        System.out.println("Square root of d: " + Math.sqrt(d));
        System.out.println("Power of c raised to b: " + Math.pow(c, b));
        System.out.println("Ceiling of c: " + Math.ceil(c));
        System.out.println("Floor of c: " + Math.floor(c));
        System.out.println("Round of c: " + Math.round(c));
        System.out.println(Math.random());						// between 0.0 and 1.0
        System.out.println((int)(Math.random() * 100)); 		// between 0 and 100
        System.out.println((int)(Math.random() * 100) + 100); 	// between 100 and 200
    }
}
