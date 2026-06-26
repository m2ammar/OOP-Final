package Lab12;

public class Box<T> {
    private T value; //T or any letter can be used big always in capital

    public Box(T value){
        this.value=value;
    }

    public  T getValue(){
        return this.value;
    }
}
