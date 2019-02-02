package L_05;

import java.util.ArrayList;

public class LinkedListExample {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;

        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
        System.out.println("Balance for customer " + anotherCustomer.getName() + " is " + anotherCustomer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (Integer intLoop : intList){
            System.out.println(intLoop);
        }

        intList.add(1,2);

        for (Integer intLoop : intList){
            System.out.println(intLoop);
        }




    }
}
