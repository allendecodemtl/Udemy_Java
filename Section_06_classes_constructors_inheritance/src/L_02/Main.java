package L_02;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0d);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmailAddress("bod@gmail.com");
        bobsAccount.setCustomerPhoneNumber("(007) 123-3456");

        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50d);
        bobsAccount.withdrawal(100d);
        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100  );


        Account maxsAccount = new Account("54321", 0d, "Max Mad", "max@mad.com", "(100) 200-4000");
        maxsAccount.withdrawal(100.0);
        maxsAccount.deposit(50d);
        maxsAccount.withdrawal(100d);
        maxsAccount.deposit(51);
        maxsAccount.withdrawal(100d);
        
        Account timsAccount = new Account("tim", "tim@test.com", "(200) 200 2000");
        timsAccount.withdrawal(200.0);
        timsAccount.deposit(60d);
        timsAccount.withdrawal(100d);
        timsAccount.deposit(61);
        timsAccount.withdrawal(100d);


        // **************************
        //    Challenge
        // **************************
        VipPerson p1 = new VipPerson();
        System.out.println(p1.getName());

        VipPerson p2 = new VipPerson("Bob","bob@email.com");
        System.out.println(p2.getName());

        VipPerson p3 = new VipPerson("Alex", 100d, "alex@email.com");
        System.out.println(p3.getName());

        
    }
}
