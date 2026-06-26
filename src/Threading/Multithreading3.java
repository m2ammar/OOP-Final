package Threading;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    Queue<Integer> buffer = new LinkedList<>();
    int capacity = 5;

    void produce(int item) {
        buffer.add(item);
        System.out.println("Produced: " + item + " | Buffer size: " + buffer.size());
    }

    int consume() {
        int item = buffer.poll();
        System.out.println("Consumed: " + item + " | Buffer size: " + buffer.size());
        return item;
    }
}

class Producer implements Runnable {
    SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.produce(i);
        }
    }
}

class Consumer implements Runnable {
    SharedBuffer buffer;

    Consumer(SharedBuffer buffer) { this.buffer = buffer; }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.consume();
        }
    }
}

public class Multithreading3 {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
