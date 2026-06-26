package Threading;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer2 {
    Queue<Integer> buffer = new LinkedList<>();
    int capacity = 5;

    // PRODUCER calls this
    synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {        // buffer full?
            System.out.println("Buffer full! Producer waiting...");
            wait();                                // release lock, go to sleep
        }

        buffer.add(item);
        System.out.println("Produced: " + item + " | Buffer: " + buffer);
        notify();                                  // wake up the consumer
    }

    // CONSUMER calls this
    synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {                 // buffer empty?
            System.out.println("Buffer empty! Consumer waiting...");
            wait();                                // release lock, go to sleep
        }

        int item = buffer.poll();
        System.out.println("Consumed: " + item + " | Buffer: " + buffer);
        notify();                                  // wake up the producer
        return item;
    }
}

class Producer2 implements Runnable {
    SharedBuffer2 buffer;

    Producer2(SharedBuffer2 buffer) { this.buffer = buffer; }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(300);         // simulate time to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer2 implements Runnable {
    SharedBuffer2 buffer;

    Consumer2(SharedBuffer2 buffer) { this.buffer = buffer; }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.consume();
                Thread.sleep(800);         // consumer is slower than producer
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Multithreading4 {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer2 buffer = new SharedBuffer2();

        Thread producer2 = new Thread(new Producer2(buffer));
        Thread consumer2 = new Thread(new Consumer2(buffer));

        producer2.start();
        consumer2.start();

        producer2.join();
        consumer2.join();

        System.out.println("All done!");
    }
}