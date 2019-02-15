package L_03_InterruptAndJoin;


import static L_03_InterruptAndJoin.ThreadColor.*;

public class AnotherThread extends  Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE +"Hello from " + currentThread().getName());

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println(ANSI_BLUE+"Another thread woke me up");
            return; // -> Terminates thread
        }
        System.out.println(ANSI_BLUE+ "Three seconds have passed and I'm awake");
    }
}
