package L_02_Runnable;

import static L_01_Threads.ThreadColor.*;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
