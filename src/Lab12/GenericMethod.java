package Lab12;

public class GenericMethod {

    public void print(String s){
        System.out.println(s);
    }

    public <T> void printAll(T s){
        System.out.println(s);
    }
}
