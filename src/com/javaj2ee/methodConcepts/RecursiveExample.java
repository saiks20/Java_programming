package com.javaj2ee.methodConcepts;

public class RecursiveExample {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
 //variable length argument instead of mentioning the number of arguments in the method signature,
 // we can use varargs to accept a variable number of arguments.
 // This allows us to pass any number of integers to the method, and it will calculate the factorial for each of them.
    public static void main(String... args) {
        RecursiveExample re = new RecursiveExample();
        int result = re.factorial(Integer.parseInt(args[0]));
        int length = args.length;
        for (int i = 0; i < length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + re.factorial(Integer.parseInt(args[i])));
        }



    }
}
