package L_03_InterruptAndJoin;

import static L_03_InterruptAndJoin.ThreadColor.*;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
