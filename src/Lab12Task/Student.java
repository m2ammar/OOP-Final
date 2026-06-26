package Lab12Task;

public class Student {
    private int id;
    private String name;
    private String batch;

    public Student(int id, String name, String batch){
        this.id=id;
        this.name=name;
        this.batch=batch;
    }

    public int getId(){
        return this.id;
    }

    public  String getName(){
        return this.name;
    }

    public String getBatch(){
        return this.batch;
    }

    // this build in method will print the info directly by just writing the object name in sout
    @Override
    public String toString() {
        return id+ " " + name+" "+batch+" ";
    }
}
