package FinalHospital;

public abstract class Person {

    protected String name;
    protected String email;

    public Person(String name, String email){
        this.name=name;
        this.email=email;
    }

    public abstract void displayRole();

    public String getName(){
        return this.name;
    }

    public void  setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return this.email;
    }

    public void  setEmail(String email){
        this.email=email;
    }
}