package LibrarySystem;

public abstract class Member {

    private int id;
    private String name;
    private String email;
    protected static int noOfStudents=0;
    protected static  int noOfStaff=0;



    public Member(int id,String name, String email){

        this.id=id;
        this.name=name;
        this.email=email;

    }

    public Member(int id, String name){

        this.id=id;
        this.name=name;
    }

    public abstract  void displayInfo();

    public  int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email=email;
    }

}
