package AssignmentPractice;

public class Main {
    public static void main(String[] args) {

        DownCounter d1= new DownCounter(-4);
        d1.decrement();

    }
}
 class DownCounter{

    private int count;

    public  DownCounter(int count){

        if(count<0) {

            this.count = Math.abs(count);
        }else {
            this.count=count;
        }
    }

    public void decrement(){
        if(count>=1) {
            this.count--;
            System.out.println("Count: "+count);
        }else {
            System.out.println("Can't decrement it");
        }
    }

    public int getCount(){
        return this.count;
    }
 }