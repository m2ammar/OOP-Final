package ThreadingBMe;

public class Threading5 {
    public static void main(String[] args) {

        Count c1 = new Count();

        Thread t1 = new Thread( new TicketBooker(c1));
        Thread t2 = new Thread( new TicketBooker(c1));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final seats remaining: "+c1.count);

    }
}

class Count{

    int count =1000;


     synchronized public void book(){
        count--;
    }
}
class TicketBooker implements Runnable{

    private Count count;

    public TicketBooker(Count count){
        this.count=count;
    }

    @Override
    public void run(){

        for(int i=0; i<5000; i++){
            count.book();
        }
    }
}