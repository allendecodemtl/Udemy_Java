package com.company.Exercise;

public class E06TeenNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int p1, int p2, int p3){
        boolean bool = false;

        if ((p1 >= 13) && (p1 <= 19)){
            return true;
        } else if ((p2 >= 13) && (p2 <= 19)){
            return true;
        } else if ((p3 >= 13) && (p3 <= 19)){
            return true;
        }

        return bool;
    }
}
