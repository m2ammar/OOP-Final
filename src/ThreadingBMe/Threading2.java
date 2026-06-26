package ThreadingBMe;

public class Threading2 {
    public static void main(String[] args) {

        Thread t1 = new Thread( new NumberPrinter(1, "ODD"));
        Thread t2 = new Thread( new NumberPrinter(2, "EVEN"));

        t1.start();
        t2.start();
        //First starting from 1 thread one at a time. checking if even
        // then print even else odd. loop till 10

    }
}

class NumberPrinter implements Runnable{

    @Override
    public void run(){

    for(int i=number; i<=10; i+=2){
            try {
                System.out.println("["+getLabel()+"] " + i);
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private int number;
    private String label;

    public NumberPrinter(int number, String label){

            this.number=number;
            this.label=label;

    }

    public int getNumber(){
        return this.number;
    }

    public String getLabel(){
        return this.label;
    }
}
