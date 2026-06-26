package LibrarySystem;

public class LibraryStaff extends Member{

    private int booksManaged;

    public LibraryStaff(String name, String email, int booksManaged){
        super(++noOfStaff,name, email);
        this.booksManaged=booksManaged;

    }

    public LibraryStaff(String name){
        super(++noOfStaff, name);
    }

    public void addBooks(int count){

        if(count>=0){
            this.booksManaged += count;
        }
    }

    public int getBooksManaged(){
        return this.booksManaged;
    }

    public void displayInfo(){

        System.out.println("Staff Id: "+this.getId()+"\nStaff Name: "+this.getName()+"\nStaff Email: "+this.getEmail()+
                "\nBooks Managed: "+this.getBooksManaged());
    }

    public int getIds(){
        return noOfStaff;
    }
}
