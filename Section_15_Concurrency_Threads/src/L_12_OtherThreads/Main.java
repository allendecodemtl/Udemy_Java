package L_12_OtherThreads;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

    }
}

class Counter{
    //private int counter = 0;
    private AtomicInteger counter = new AtomicInteger(0);

    public void inc(){
        // counter++;
        counter.incrementAndGet();
    }

    public void dec(){
        // counter--;
        counter.decrementAndGet();
    }

    public int getCounter() {
        // return counter;
        return counter.get();
    }
}
