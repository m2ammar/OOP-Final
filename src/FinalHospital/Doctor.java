package FinalHospital;

public class Doctor  extends Person{

    protected Specialization specialization;

    public Doctor(String name, String email){
        super(name, email);
        this.specialization=Specialization.GENERAL;
    }

    public Doctor(String name, String email, Specialization specialization){
        super(name, email);
        this.specialization=specialization;
    }

    @Override
    public void displayRole(){
        System.out.println("Role: Doctor");
    }

    public  Specialization getSpecialization(){
        return this.specialization;
    }

    public void setSpecialization(Specialization specialization){
        this.specialization=specialization;
    }
}
