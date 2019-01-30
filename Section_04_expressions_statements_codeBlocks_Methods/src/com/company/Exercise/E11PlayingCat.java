package com.company.Exercise;

public class E11PlayingCat {
    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperateur){
        if (summer) {
            if (temperateur < 25 || temperateur > 45) {
                return false;
            } else {
                return true;
            }
        } else {
            if (temperateur < 25 || temperateur > 35) {
                return false;
            } else {
                return true;
            }
        }
    }
}
