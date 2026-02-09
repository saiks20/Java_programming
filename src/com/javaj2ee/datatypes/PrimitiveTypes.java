package com.javaj2ee.datatypes;

public class PrimitiveTypes {
    public static void main(String[] args){
        int i =16;
        boolean flag = true;
        double d = 12;
        float f =1.3f;
        char c = 'a';
        long l =11;
        byte b =127;
        long l1 = 2_000_00_00;
        char c1 = 100;
        System.out.println("print the byte"+b);
        System.out.println("print the float"+f);
        double d1=l1;
        System.out.println("print the double converted from long: "+d1);
        System.out.println("print the character which takes int literals " +
                "but no overflow: "+c1);
        byte b2= (byte) 1000;
        System.out.println("print the byte which takes int literals " +
                "with overflow: "+b2);


    }
}
