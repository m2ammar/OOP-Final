package Threading;

class MyTask implements Runnable {
    private String name;

    MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + name + " - count: " + i);
            try {
                Thread.sleep(1222);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Multithreading1 {
    public static void main(String[] args) {
        MyTask myTask1 = new MyTask("A");
        MyTask myTask2 = new MyTask("B");
        Thread t1 = new Thread(myTask1);
        Thread t2 = new Thread(myTask2);
        Thread t3 = new Thread(new  MyTask("C"));

        t1.start();
        t2.start();
    }
}
