package Threading;

class Counter {
    int count = 0;

    synchronized void increment() {
        count++; // still not atomic!
    }

    public int getCount() {
        return count;
    }
}

class CounterTask implements Runnable {  // implements Runnable instead
    Counter counter;
    CounterTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
            System.out.println(counter.getCount());
        }
    }
}

public class Multithreading2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(); // ONE shared counter object
        CounterTask c1 = new CounterTask(counter);
        Thread t1 = new Thread(c1); // pass same counter
        Thread t2 = new Thread(new CounterTask(counter)); // to both threads

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected: 20000");
        System.out.println("Actual:   " + counter.count);
    }
}