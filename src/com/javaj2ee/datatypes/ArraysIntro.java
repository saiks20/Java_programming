package com.javaj2ee.datatypes;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args){
        int[] array1 = new int[10];
        double[] array2 = new double[5];
        long[] array3= new long[5];
        System.out.println("print all the default initialization of array element: for integer: "
                +array1[1] +" :for double: "+array2[2]+" :for long: "+array3[2]);
        int[] array4 ={1,7,0,-12,13,7,-3,8,7,-98};
        array1=array4;
        System.out.println("to print unsorted array"+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("to print sorted array"+Arrays.toString(array1));
        int[][] matrix = new int[10][];
        int[][] matrix2 = {
                {1,8,7},
                {7,3,-1},{9,0,-12}
        };
        System.out.println(matrix[5]);
        System.out.println("matrix element printing"+matrix2[2][2]);
        System.out.println("matrix printing with Arrays"+Arrays.toString(matrix2));
    }
}
