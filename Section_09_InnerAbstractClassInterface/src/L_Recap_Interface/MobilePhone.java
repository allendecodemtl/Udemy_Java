package L_Recap_Interface;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone implements ITelephone {
    private String myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public String getMyNumber() {
        return myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(String phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Phone is switch off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Meloby ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public List<String> returnContacts() {
        List<String> values = new ArrayList<>();   // -> Specify implementation of List
        values.add(0, this.myNumber);
        return values;
    }

    @Override
    public void printContracts(List<String> listContacts) {
        System.out.println("MobilePhone");
    }
}
