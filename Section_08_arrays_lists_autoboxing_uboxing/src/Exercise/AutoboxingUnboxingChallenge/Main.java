package Exercise.AutoboxingUnboxingChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Bank bank = new Bank("My Bank");

        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.90);
        bank.addCustomer("Adelaide", "Mike", 213.54);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.34);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.32);
        bank.addCustomerTransaction("Adelaide", "Tim", 412.42);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.54);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);

    }
}
