package Exercise.AutoboxingUnboxingChallenge;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> listTransactions;

    public Customer(String name, double initialAmount) {
        this.customerName = name;
        this.listTransactions = new ArrayList<Double>();
        this.addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.listTransactions.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getListTransactions() {
        return listTransactions;
    }
}
