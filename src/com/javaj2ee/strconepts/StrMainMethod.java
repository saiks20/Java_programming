package com.javaj2ee.strconepts;

public class StrMainMethod {
    // in this class we are going to see the main methods of String class and
    //how to use them in our program
    public static void main(String[] args) {
        String str = " Hello World ";
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());
        System.out.println("Does the string start with ' '? " + str.startsWith(" "));
        System.out.println("Does the string end with ' '? " + str.endsWith(" "));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("Trimmed string: " + str.trim());
        System.out.println("Split String by character 'e': ");
        String[] parts = str.split("e");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println("String is empty: " + str.isEmpty());

        // s1 is part of string pool and s2 is not part of string pool
        // because we are using new operator to create new object.
        //intern() method is used to return the string from the string pool
        // if it is already present in the string pool otherwise it will add the string to the string pool
        // and return the reference of that string.
        String s1 =" Hello World ";
        String s2 = new String(" Hello World ");
        System.out.println("str == s2: " + (str == s2));
        System.out.println("str.equals(s2): " + str.equals(s2));
        System.out.println("Str==s2.intern(): " + (str == s2.intern()));
        System.out.println("str == s1: " + (str == s1));
        System.out.println("str.equals(s1): " + str.equals(s1));
        System.out.println("Str.contains (\"Hello\"): " + str.contains("Hello"));
        String s3 = " HELLO WORLD ";
        System.out.println("str.equalsIgnoreCase(s3): " + str.equalsIgnoreCase(s3));
        System.out.println("str.compareTo(s3): " + str.compareTo(s3));
        System.out.println("str.compareToIgnoreCase(s3): " + str.compareToIgnoreCase(s3));

    }
}
