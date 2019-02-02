package L_Recap_Interface;

import java.util.List;

public interface ITelephone {
    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
    //================
    List<String> returnContacts();
    void printContracts(List<String> listContacts);
}
