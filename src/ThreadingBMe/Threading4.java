package ThreadingBMe;

public class Threading4 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread( new DeliveryStep("Order Received", 1000));
        Thread t2 = new Thread( new DeliveryStep("Food Prepared", 1000));
        Thread t3 = new Thread( new DeliveryStep("Out for Delivery", 1000));

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
        //Without join the last sout will print in between threads.
        //with join after completion of thread the last statement will be print


        System.out.println("Deliver Complete!");
    }
}

class DeliveryStep implements  Runnable{

    private String stepName;
    private int duration;

    public DeliveryStep(String stepName, int duration){

        this.stepName=stepName;
        this.duration=duration;
    }

    @Override
    public void  run(){

        try {
            System.out.println("Starting: "+stepName);
            Thread.sleep(duration);
            System.out.println("Done: "+stepName);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public String getStepName(){
        return stepName;
    }

    public int getDuration() {
        return duration;
    }
}
