package L_01;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(99999);
        timsPhone.powerOn();
        timsPhone.callPhone(99999);
        timsPhone.answer();
    }
}

