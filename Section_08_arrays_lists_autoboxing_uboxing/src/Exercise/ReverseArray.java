package Exercise;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3 ,7, 11, 9 ,15, 8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseMine(arr)));
        System.out.println("Array = " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array = " + Arrays.toString(arr));
    }

    public static int[] reverseMine(int[] array){
        int[] reverseArray = new int[array.length];
        for(int i = 0; i< array.length; i++){
            reverseArray[i] = array[array.length-1-i];
        }
        return reverseArray;
    }

    private static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;

        for (int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex-i] = temp;
        }
    }
}
