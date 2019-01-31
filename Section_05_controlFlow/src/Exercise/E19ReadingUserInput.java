package Exercise;

import java.util.Scanner;

public class E19ReadingUserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int limit = 10;
        int sum = 0;
        int counter = 1;

        while (counter <= limit) {

            System.out.println("Enter number #" + counter);

            if (s.hasNextInt()){
                int input = s.nextInt();
                sum += input;
                counter++;
            } else {
                System.out.println("Invalid Number");

            }
            s.nextLine();
        }

        System.out.println(sum);
        s.close();

    }
}
