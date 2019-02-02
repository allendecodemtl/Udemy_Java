package Exercise.AutoboxingUnboxingChallenge;

import Exercise.ArrayListChallenge.Contact;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> listBranch;

    public Bank(String name) {
        this.name = name;
        this.listBranch = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            Branch newBranch = Branch.addBranch(name);
            this.listBranch.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, initialAmount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.listBranch.size(); i++) {
            Branch checkedBranch = this.listBranch.get(i);
            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getListCustomer();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName() + "[" + (i+1) + "]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getListTransactions();

                    for (int j=0; j<transactions.size();j++){
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
