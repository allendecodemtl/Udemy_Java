package Exercise.AutoboxingUnboxingChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit){
            System.out.println("Enter number to proceed: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    bank.printListBranch();
                    break;
                case 2:
                    addNewBranch();
                    break;
                case 6:
                    printListOfCustomer();
                    break;
                case 7:
                    addNewCustomer();
                    break;
                case 99:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice option");
        System.out.println("\t1 - To print the list of branches");
        System.out.println("\t2 - To add new branch");
        System.out.println("\t3 - To modify branch");
        System.out.println("\t4 - To remove branch");
        System.out.println("\t5 - To search branch");
        System.out.println("\t6 - To print the list of customers");
        System.out.println("\t7 - To add new customer");
        System.out.println("\t8 - To modify customer");
        System.out.println("\t9 - To remove customer");
        System.out.println("\t10 - To search customer");
        System.out.println("\t6 - To print the list of transactions");
        System.out.println("\t7 - To add new transactions");
        System.out.println("\t8 - To modify transactions");
        System.out.println("\t9 - To remove transactions");
        System.out.println("\t10 - To search transactions");
        System.out.println("\t99 - To quit ");
    }
}
