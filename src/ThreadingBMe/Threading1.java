package ThreadingBMe;

public class Threading1 {
    public static void main(String[] args) {

        GreetingTask greetingTask = new GreetingTask("Ammar");
        GreetingTask greetingTask2 = new GreetingTask("Hamza");

        Thread t1 = new Thread(greetingTask);
        Thread t2 = new Thread(greetingTask2);
        Thread t3 = new Thread(new GreetingTask("Hadi"));

        t1.start();
        t2.start();
        t3.start();
        // Thread scheduling is handled by the OS, not Java.
        // Threads run concurrently so print order is non-deterministic.

    }
}
 class GreetingTask implements Runnable{

    @Override
    public void run(){

        for(int i=1; i<=5; i++){
            System.out.println("Hello from "+getName()+"!");
        }
    }

    private String threadName;

    public GreetingTask(String threadName){
        this.threadName=threadName;
    }

    public String  getName(){
        return this.threadName;
    }

 }