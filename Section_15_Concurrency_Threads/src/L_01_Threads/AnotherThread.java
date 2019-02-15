package L_01_Threads;

import static L_01_Threads.ThreadColor.*;

public class AnotherThread extends  Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE +"Hello from another thread");
    }
}
