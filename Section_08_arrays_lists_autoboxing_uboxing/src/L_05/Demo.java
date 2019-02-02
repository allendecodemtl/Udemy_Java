package L_05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();

        addInOrder(placeToVisit, "Sydney");
        addInOrder(placeToVisit, "Melbourne");
        addInOrder(placeToVisit, "Brisbane");
        addInOrder(placeToVisit, "Perth");
        addInOrder(placeToVisit, "Canberra");
        addInOrder(placeToVisit, "Adelaide");
        addInOrder(placeToVisit, "Darwin");

        printList(placeToVisit);

        addInOrder(placeToVisit, "Alice Springs");
        addInOrder(placeToVisit, "Darwin");
        printList(placeToVisit);

        //visit(placeToVisit);
        visitFixed(placeToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("========================");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringIterator = linkedList.listIterator();

        while (stringIterator.hasNext()) {
            int comparison = stringIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " already included as destination");
            } else if (comparison > 0) {
                stringIterator.previous();
                stringIterator.add(newCity);
                return true;
            } else if (comparison < 0) {

            }

        }

        stringIterator.add(newCity);
        return true;
    }

    private static void visitFixed(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }


    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }


    }

    private static void printMenu() {
        System.out.println("Available action:\npress ");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - to to previous city");
        System.out.println("3 - print menu options");
    }
}
