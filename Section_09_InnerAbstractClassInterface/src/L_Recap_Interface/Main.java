package L_Recap_Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeskPhone timsPhone = new DeskPhone("123456");
        timsPhone.powerOn();
        timsPhone.callPhone("123456");
        timsPhone.answer();

        MobilePhone tedsPhone = new MobilePhone("99999");
        tedsPhone.powerOn();
        tedsPhone.callPhone("99999");
        tedsPhone.answer();

        loadObject(timsPhone);
        loadObject(tedsPhone);

        ITelephone iPhone = new MobilePhone("99999");
        timsPhone.getMyNumber();
        tedsPhone.getMyNumber();
        ((MobilePhone) iPhone).getMyNumber();



    }

    public static void loadObject (ITelephone objectLoad){  // -> Generic parameter for object
        List<String> test = new ArrayList<>();
        objectLoad.printContracts(test);
    }
}

