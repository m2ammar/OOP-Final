package AssignmentPractice;

public class AssignmentBulb {

    private boolean status;
    private int intensity;

    public AssignmentBulb(){
        this.status=false;
        this.intensity=0;
    }

    public void on(){
        if(!status){
            this.status=true;
            intensity=25;
            System.out.println("On");
        }
    }

    public void on(int value){

        if(!status){
            this.intensity=value;
            this.status=true;
            System.out.println("On");
        }
    }

    public void off(){
        if(status){
            this.status=false;
            System.out.println("Off");
        }
    }

    public void brighten(){

        if(intensity<100){
            intensity++;
        }
    }

    public void darken(){

        if(intensity>1){
            intensity--;
        }
    }

    public boolean isOn(){
        return status;
    }

    public int getIntensity(){

        if(status){

            return intensity;
        }return 0;
    }
}
