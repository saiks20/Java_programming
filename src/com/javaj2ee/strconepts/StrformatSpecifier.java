package com.javaj2ee.strconepts;

public class StrformatSpecifier {
    // This class is used to demonstrate different String format specifiers in Java.
    //%.2f is used to format a float or double value to 2 decimal places.
    //%d is used to format an integer value.
    //%c is used to format a character value.
    //%s is used to format a string value.
    //%b is used to format a boolean value.
    //%e is used to format a float or double value in scientific notation.
    //%E is used to format a float or double value in scientific notation with an uppercase E.
    public static void main(String[] args) {
        int i = 10;
        float f = 10.5f;
        double d = 10.5;
        char c = 'A';
        float f2 = 123456.789f;
        String s = "Hello";
        System.out.println(String.format("Integer: %d", i));
        System.out.println(String.format("Float: %.2f", f));
        System.out.println(String.format("Double: %.2f", d));
        System.out.println(String.format("Character: %c", c));
        System.out.println(String.format("String: %s", s));
        System.out.println(String.format("Boolean: %b", true));
        System.out.println(String.format("Scientific notation: %e", f2));
        System.out.println(String.format("Scientific notation with uppercase E: %E", f2));
    }
}
