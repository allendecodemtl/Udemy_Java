package com.company.e_02;

public class FloatAndDouble {

    public static void main(String[] args) {
        tutorial();
        exercise();
    }

    private static void exercise(){
        double pounds = 200d;
        double convertedKilograms = pounds * 0.45359237;
        System.out.println(convertedKilograms);
    }

    private static void tutorial() {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of int = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of int = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);
    }
}
