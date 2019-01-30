package com.company.Exercise;

public class E03LeapYearCalculator {

    public static void main(String[] args) {
        boolean res;

        res = isLeapYear(-1600);
        // return false since parameter is not in the range(1 - 9999)
        System.out.println(res);

        res =  isLeapYear(1600);
        // return true since 1600 is leap year
        System.out.println(res);

        res =  isLeapYear(2017);
        // return false since 2017 is not a leap year
        System.out.println(res);

        res =  isLeapYear(2000);
        // return true because 2000 is a leap year
        System.out.println(res);
    }

    public static boolean isLeapYear(int year) {
        boolean bool = false;

        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            }
        }

        return bool;
    }
}
