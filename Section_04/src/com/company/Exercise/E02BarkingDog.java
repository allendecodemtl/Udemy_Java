package com.company.Exercise;

public class E02BarkingDog {
    public static void main(String[] args) {
        boolean res;

        res = bark(true, 1);
        //should return true
        System.out.println(res);

        res = bark(false, 2);
        //should return false since the dog is not barking.
        System.out.println(res);

        res =bark(true, 8);
        //should return false,since it 's not before 8:00AM.
        System.out.println(res);

        res = bark(true, -1);
        //should return false because the hourOfDay parameter needs to be in range 0 - 23.
        System.out.println(res);
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean returnBoolean = false;

        if (barking) {
            if ((hourOfDay >=0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)) {
                returnBoolean = true;
            }
        }

        return returnBoolean;
    }
}
