package CarInternal;

public class Car {

    private boolean engineRunning;
    private PushStart pushStart;
    private Brakes brakes;
    private Gears gears;

    public Car(){
        this.engineRunning=false;
        this.pushStart= new PushStart();
        this.brakes= new Brakes();
        this.gears=Gears.Park;

    }

    public boolean startCar(){
        if(pushStart.isPushed() &&  gears == Gears.Park  && brakes.isApplied()){
            this.engineRunning=true;
            return true;
        }
        return false;
    }

    public boolean stopCar(){
        if(engineRunning == true && pushStart.isPushed() && gears == Gears.Park){
            this.engineRunning=false;
            return true;
        }
        return false;
    }

    public void setGears(Gears gears){
        this.gears=gears;
    }

    public boolean isEngineRunning(){
        return this.engineRunning;
    }

    public PushStart getPushStart(){
        return this.pushStart;
    }

    public Brakes getBrakes(){
        return this.brakes;
    }

    public Gears getGears(){
        return this.gears;
    }
}
