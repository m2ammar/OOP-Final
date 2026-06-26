package ThreadingBMe;

public class Threading3 {
    public static void main(String[] args) {

        CountDownTask c = new CountDownTask("Rocket", 10);
        CountDownTask c2 = new CountDownTask("Satellite", 7);
        CountDownTask c3 = new CountDownTask("Probe", 5);


        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();

//         System.out.println(c.getTimerName()+": Launched");
////        System.out.println(c2.getTimerName()+": Launched");
////        System.out.println(c3.getTimerName()+": Launched");
    }
}

class CountDownTask implements Runnable{

    private String timerName;
    private int startCount;

    public CountDownTask(String timerName, int startCount){
        this.timerName=timerName;
        this.startCount=startCount;
    }

    @Override
    public void run(){

        for(int i=startCount; i>=1; i--){
            try {
                Thread.sleep(500);
                System.out.println(getTimerName()+": "+i);
                if(i==1){
                    System.out.println(getTimerName()+": Launched!");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public String getTimerName(){
        return timerName;
    }

    public int getStartCount(){
        return startCount;
    }

}