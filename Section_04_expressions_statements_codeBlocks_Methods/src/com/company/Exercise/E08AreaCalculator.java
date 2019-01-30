package com.company.Exercise;

public class E08AreaCalculator {


    public static void main(String[] args) {
        area(1,2);
        area(2);
    }

    public static double area (double radius){
        if (radius < 0){
            return -1;
        }

        return radius * radius * 3.14159d;

    }


    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1;
        }

        return x * y;
    }
}
