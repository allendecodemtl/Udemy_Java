package com.company.Exercise;

public class E04DecimalComparator {
    public static void main(String[] args) {
        boolean res;

        res = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        // return true since numbers are equal up to 3 decimal places.
        System.out.println(res);

        res = areEqualByThreeDecimalPlaces(3.175, 3.176);
        // return false since numbers are not equal up to 3 decimal places
        System.out.println(res);

        res = areEqualByThreeDecimalPlaces(3.0, 3.0);
        // return true since numbers are equal up to 3 decimal places.
        System.out.println(res);

    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        boolean bool = false;

        int castD1 = (int) (d1 * 1000);
        int castD2 = (int) (d2 * 1000);

        if (castD1 == castD2) {
            bool = true;
        }

        return bool;
    }
}
