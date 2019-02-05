package com.github.allendecodemtl.math;

public class Series {

    public static long nSum(int n){
        return (n * (n+1)) / 2;
    }

    public static long factorial(int n){
        if(n == 0){
            return 1;
        }

        long fact = 1;
        for (int i=1; i<= n; i++){
            fact *= i;
        }

        return fact;
    }

    public static long fibonacci(int number){
        if(number == 0){
            return 0;
        } else if (number == 1){
            return 1;
        }

        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;

        for(int i=1; i<number; i++){
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}
