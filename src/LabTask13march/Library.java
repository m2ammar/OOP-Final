package LabTask13march;

public class Library {
    private String name;
    private int NoOfBooks;
    private String address;

    private static int instance = 0;


    private Library(String name, int NoOfBooks, String address) {
        this.name = name;
        this.NoOfBooks = NoOfBooks;
        this.address = address;
    }


    public static Library makeObject(String name, int NoOfBooks, String address) {
        if (instance < 3) {
            instance++;
            return new Library(name, NoOfBooks, address);
        }
        return null;
    }

    public String getName(){
       return this.name;
    }

    public int getNoOfBooks(){
        return this.NoOfBooks;
    }

    public String getAddress(){
        return this.address;
    }
}