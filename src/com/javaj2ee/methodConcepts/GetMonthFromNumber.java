package com.javaj2ee.methodConcepts;

public class GetMonthFromNumber {
    // Enum to represent the months of the year
    // Each month has a name and a number of days associated with it
    // The enum provides a method to retrieve the number of days for each month
    public static void main(String... args) {
        int monthNumber = 0;
        for(int i=0; i<args.length; i++){
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
            monthNumber = Integer.parseInt(args[i]);
            Month month = getMonthFromNumber(monthNumber);
            if (month != null) {
                System.out.println("The month is: " + month);
                System.out.println("Number of days: " + month.getDays());
            } else {
                System.out.println("Invalid month number.");
            }
        }
        Month[] months = Month.values();
        for(Month month : months) {
            System.out.println(month + " has " + month.getDays() + " days.");
        }
        Month[] cardinalMonths = {Month.JANUARY, Month.APRIL, Month.JULY, Month.OCTOBER};
        System.out.println("Cardinal months:");
        for(Month month : cardinalMonths) {
            // The ordinal() method returns the position of the enum constant in its enum declaration,
            // where the initial constant is assigned an ordinal of zero.
            System.out.println(month.ordinal() + 1 + ": " + month);
        }
    }

    private static Month getMonthFromNumber(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return Month.JANUARY;
            case 2:
                return Month.FEBRUARY;
            case 3:
                return Month.MARCH;
            case 4:
                return Month.APRIL;
            case 5:
                return Month.MAY;
            case 6:
                return Month.JUNE;
            case 7:
                return Month.JULY;
            case 8:
                return Month.AUGUST;
            case 9:
                return Month.SEPTEMBER;
            case 10:
                return Month.OCTOBER;
            case 11:
                return Month.NOVEMBER;
            case 12:
                return Month.DECEMBER;
            default:
                return null;
        }
    }
}
