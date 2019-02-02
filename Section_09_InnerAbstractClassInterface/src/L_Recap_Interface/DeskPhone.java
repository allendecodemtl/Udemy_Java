package L_Recap_Interface;

import java.util.LinkedList;
import java.util.List;

public class DeskPhone implements ITelephone {
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public String getMyNumber() {
        return myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public List<String> returnContacts() {
        List<String> values = new LinkedList<>();   // -> Specify implementation of List
        values.add(0, this.myNumber);
        return values;
    }

    @Override
    public void printContracts(List<String> listContacts) {
        System.out.println("Deskphone");
    }
}
