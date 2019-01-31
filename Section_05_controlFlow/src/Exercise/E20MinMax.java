package Exercise;

import java.util.Scanner;

public class E20MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = 0;

        while(true){
            System.out.println("Enter number: ");

            if (sc.hasNextInt()){
                int input = sc.nextInt();

                if (input > max) max = input;
                if (input < min) min = input;

            } else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("Min: " + min + " Max: " + max);

        sc.close();

    }
}
