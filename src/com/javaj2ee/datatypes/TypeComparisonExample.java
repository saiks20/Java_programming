package com.javaj2ee.datatypes;

public class TypeComparisonExample {
    public static void main(String[] args) {
        int i = 10;
        long l = 10L;
        float f = 10.0f;
        double d = 10.0;
        Integer iObj = 10;
        Integer iObj2 = 10;
        Integer iObj3 = new Integer(127);
        Integer iObj4 = new Integer(127);
        Double dObj = 10.0;
        Double dObj2 = 10.0;
        Character cObj = '\u0041'; // Unicode for 'A'
        Character cObj2 = 'A';
        String s1 = "Hello";
        String s2 = "Hello";
        Long obj1 = 10L;
        Long obj2 = 10L;

        System.out.println("i == l: " + (i == l)); // true
        System.out.println("i == f: " + (i == f)); // true
        System.out.println("i == d: " + (i == d)); // true
        System.out.println("l == f: " + (l == f)); // true
        System.out.println("l == d: " + (l == d)); // true
        System.out.println("f == d: " + (f == d)); // true

        char c = 'A';
        int i2 = 65;

        System.out.println("c == i2: " + (c == i2)); // true
        System.out.println("obj1 == obj2: " + (iObj == iObj2)); // true
        System.out.println("obj1.equals(obj2): " + (iObj.equals(iObj2))); // true
        System.out.println("obj3 == obj4: " + (iObj3 == iObj4)); // false here it turns false because we are using new operator to create new object
        System.out.println("obj3.equals(obj4): " + (iObj3.equals(iObj4))); // true
        System.out.println("dObj == dObj2: " + (dObj == dObj2)); // false
        System.out.println("dObj.equals(dObj2): " + (dObj.equals(dObj2))); // true
        System.out.println("cObj == cObj2: " + (cObj == cObj2)); // true
        System.out.println("cObj.equals(cObj2): " + (cObj.equals(cObj2))); // true
        System.out.println("s1 == s2: " + (s1 == s2)); // true
        System.out.println("s1.equals(s2): " + (s1.equals(s2))); // true
        System.out.println("obj1 == obj2: " + (obj1 == obj2)); // true
        System.out.println("obj1.equals(obj2): " + (obj1.equals(obj2))); // true

    }
}
