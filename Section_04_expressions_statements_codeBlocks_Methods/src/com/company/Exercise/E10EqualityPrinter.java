package com.company.Exercise;

public class E10EqualityPrinter {

    public static void main(String[] args) {

    }

    public static void printEqual(int p1, int p2, int p3){

        boolean allEqual = ((p1 == p2) && (p1 == p3) && (p2 == p3));
        boolean allNotEqual = ((p1 != p2) && (p1 != p3) && (p2 != p3));

        if (p1 < 0 || p2 < 0 || p3 < 0) {
            System.out.printf("Invalid Value");
        } else if (allEqual) {
            System.out.printf("All numbers are equal");
        } else if (allNotEqual){
            System.out.printf("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }


    }
}
