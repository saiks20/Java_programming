package com.javaj2ee.datatypes;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args){
        BigDecimal bigDecimal1 = new BigDecimal("123456789.987654321");
        BigDecimal bigDecimal2 = new BigDecimal("0.00000000123456789");
        BigDecimal sum = bigDecimal1.add(bigDecimal2);
        BigDecimal difference = bigDecimal1.subtract(bigDecimal2);
        BigDecimal product = bigDecimal1.multiply(bigDecimal2);
        BigDecimal quotient = bigDecimal1.divide(bigDecimal2, MathContext.DECIMAL128);
        int currency= 20;
        int numberofPeople=3;
        int share=currency/numberofPeople;
// this will give a integer result like 6
        System.out.println("Share: " + share);
        double share2= (double) currency /numberofPeople;
// in case of double it will give a result like 6.6666666666666667 whic is not precise
        System.out.println("Share with double: " + share2);
// in below case using bigDecimal will make the result precise
        BigDecimal bigCurrency = BigDecimal.valueOf(currency).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bigNumberOfPeople = BigDecimal.valueOf(numberofPeople).setScale(2, RoundingMode.HALF_UP);
        BigDecimal share3 = bigCurrency.divide(bigNumberOfPeople, RoundingMode.HALF_UP);
        System.out.println("Share with BigDecimal: " + share3);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
