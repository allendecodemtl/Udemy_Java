package Exercise;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count");
        int count = sc.nextInt();
        sc.nextLine();
        int[] inputArray = readInegers(count);
        int minimum = findMin(inputArray);
        System.out.println("Min number in array: " + minimum);
    }

    public static int[] readInegers(int count){
        int[] array = new int[count];

        for(int i=0;i<count;i++){
            System.out.println("Enter " + count + " numbers:");
            int num = sc.nextInt();
            sc.nextLine();
            array[i] = num;
        }

        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;


        for(int i=0; i<array.length-1; i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }
}
