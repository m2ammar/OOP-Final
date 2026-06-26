package Motor;

public class Main {
    public static void main(String[] args) {

    }
}

class Motor{
    private int speed;
    private boolean  status;

    public Motor(){
        this.speed=0;
        this.status=false;
    }

    public void speedUp(){
        if(speed < 7500) {
            this.speed += 2500;
            if(speed == 2500) {
                this.status = true;
            }
        }
    }

    public void speedDown(){

        if(speed>=2500) {
            this.speed -= 2500;
            if (speed == 0) {
                this.status = false;
            }
        }else {
            System.out.println("Cannot reduce speed more ");
        }
    }

    public int getSpeed(){
        return speed;
    }

    public boolean isStatus(){
        return status;
    }
}
