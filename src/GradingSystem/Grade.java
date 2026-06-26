package GradingSystem;

public enum Grade {

    A("Exceptional!"), B("Keep it up!"), C("Average!"),  F("Needs to lock in!");
    private String description;

    Grade(String description){
        this.description=description;
    }

    public String getDescription(){
        return this.description;
    }
}
