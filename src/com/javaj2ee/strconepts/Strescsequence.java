package com.javaj2ee.strconepts;

public class Strescsequence {
    // This class is used to demonstrate the escape sequences in Java.
    // \r is used to add a carriage return
    // which means it will move the cursor to the beginning of the line and overwrite the existing characters.
    // \f is used to add a form feed which means it will move the cursor to the next page.
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello\tWorld"); // \t is used to add a tab space
        System.out.println("Hello\nWorld"); // \n is used to add a new line
        System.out.println("Hello\bWorld"); // \b is used to add a backspace
        System.out.println("Hello\rWorld"); // \r is used to add a carriage return
        System.out.println("Hello\fWorld"); // \f is used to add a form feed
        System.out.println("Hello\\World"); // \\ is used to add a backslash
        System.out.println("Hello\'World"); // \' is used to add a single quote
        System.out.println("Hello\"World"); // \" is used to add a double quote
        System.out.println("unicode character, \u00A9 IT BULLS");// \u00A9 is used to add a unicode character
    }
}
