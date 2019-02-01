package L_03;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAndArray {
    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    serachForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }


    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice option");
        System.out.println("\t1 - To print the list of grocery");
        System.out.println("\t2 - To add an item");
        System.out.println("\t3 - To modify an item ");
        System.out.println("\t4 - To remove an item ");
        System.out.println("\t5 - To search an item ");
        System.out.println("\t6 - To quit ");
    }


    public static void addItem() {
        System.out.print("Enter the grocery item: ");
        groceryList.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String currentItem = sc.nextLine();
        System.out.println("Enter new item: ");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String currentItem = sc.nextLine();
        groceryList.removeGroveryItem(currentItem);
    }

    public static void serachForItem() {
        System.out.println("Item to search for: ");
        String searchItem = sc.nextLine();
        if (groceryList.onFiles(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
