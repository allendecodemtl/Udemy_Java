package com.company.e_04;

public class Strings {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println(myString);
        myString += " More";
        System.out.println(myString);

        String numberString = "250.65";
        numberString += "49.50"; // Will concatenate
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString += myInt;
        System.out.println(lastString);

        // Won't allow to add -> left to right assignment
        //int test = myInt + lastString;
        //System.out.printf(test);

    }
}
