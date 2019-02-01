package Exercise.AutoboxingUnboxingChallenge;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> listCustomer;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.listCustomer = new ArrayList<Customer>();
    }

    public static Branch addBranch(String name){
        return new Branch(name);
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getListCustomer() {
        return listCustomer;
    }

    private Customer findCustomer(String customerName){
        for(int i=0; i<this.listCustomer.size(); i++) {
            Customer checkedCustomer = this.listCustomer.get(i);
            if (checkedCustomer.getCustomerName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

    public boolean addCustomer(String name, double initialAmount){

        if (findCustomer(name) == null){
            this.listCustomer.add(new Customer(name, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
}
