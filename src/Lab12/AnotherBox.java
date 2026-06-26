package Lab12;

public class AnotherBox<T extends Number> {
    private T value;

    public AnotherBox(T value){
        this.value=value;
    }

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value=value;
    }
}
