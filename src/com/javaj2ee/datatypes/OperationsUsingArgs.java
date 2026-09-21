package com.javaj2ee.datatypes;

public class OperationsUsingArgs {
    public static void main(String[] args){
        System.out.println("Addition of two numbers: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
    }
}
