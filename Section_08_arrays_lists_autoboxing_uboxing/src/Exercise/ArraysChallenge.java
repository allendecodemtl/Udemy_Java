package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

    private static Scanner sc = new java.util.Scanner(System.in);

    // [106, 26, 81, 5, 15] -> [106,81, 26, 15, 5]
    public static void main(String[] args) {
        int[] inputIntegers = getIntegers(5);
        int[] sortedArrays = sortIntegers(inputIntegers);
        printArray(sortedArrays);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer value to be sorted.\r");

        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = sc.nextInt();
        }

        return values;

    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//
//        for(int i=0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+2] = temp;
                    flag = true;
                }
            }

        }

        return sortedArray;
    }
}
