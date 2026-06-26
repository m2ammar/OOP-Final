import java.util.ArrayList;
import java.util.List;

class Q9 {
    public static void main(String[] args) {

        // TC1: Member displayRole()
        Member m1 = new Member("Ali", "LIB001");
        m1.displayRole();
        // Expected: Role: Member

        // TC2: Librarian displayRole()
        Librarian lib1 = new Librarian("Sara", "LIB002");
        lib1.displayRole();
        // Expected: Role: Librarian

        // TC3: Librarian default department
        Librarian lib2 = new Librarian("Usman", "LIB003");
        System.out.println(lib2.getDepartment());
        // Expected: GENERAL

        // TC4: Librarian with set department
        Librarian lib3 = new Librarian("Hina", "LIB004");
        lib3.setDepartment(Department.SCIENCE);
        System.out.println(lib3.getDepartment());
        // Expected: SCIENCE

        // TC5: Book mandatory attributes
        Book b1 = new Book("Calculus", 1500.0);
        System.out.println(b1.getTitle() + " " + b1.getPrice());
        // Expected: Calculus 1500.0

        // TC6: Book optional author
        Book b2 = new Book("Physics", 800.0);
        b2.setAuthor("Halliday");
        System.out.println(b2.getAuthor());
        // Expected: Halliday

        // TC7: Loan default status
        Loan loan1 = new Loan(m1);
        System.out.println(loan1.getLoanStatus());
        // Expected: PENDING

        // TC8: Loan member getter
        Loan loan2 = new Loan(m1);
        System.out.println(loan2.getMember().getName());
        // Expected: Ali

        // TC9: addBook and loanSummary
        Book b3 = new Book("Chemistry", 1200.0);
        Loan loan3 = new Loan(m1);
        loan3.addBook(b1);
        loan3.addBook(b2);
        loan3.addBook(b3);
        loan3.loanSummary();
        // Expected:
        // Loan Summary:
        // Status: PENDING
        // Book: Calculus --- Price: 1500.0
        // Book: Physics --- Price: 800.0
        // Book: Chemistry --- Price: 1200.0

        // TC10: addBook with quantity
        Book b4 = new Book("Biology", 600.0);
        Loan loan4 = new Loan(m1);
        loan4.addBook(b4, 3);
        loan4.loanSummary();
        // Expected: Biology appears 3 times in summary

        // TC11: LoanStatus setter
        Loan loan5 = new Loan(m1);
        loan5.setLoanStatus(LoanStatus.ISSUED);
        System.out.println(loan5.getLoanStatus());
        // Expected: ISSUED

        // TC12: Department enum values
        System.out.println(Department.ARTS);
        System.out.println(Department.LAW);
        // Expected: ARTS then LAW

        // TC13: LoanStatus enum values
        System.out.println(LoanStatus.RETURNED);
        System.out.println(LoanStatus.APPROVED);
        // Expected: RETURNED then APPROVED

        // TC14: StorageBox with Book
        StorageBox<Book> box1 = new StorageBox<>(b1);
        System.out.println(box1.getItem().getTitle());
        // Expected: Calculus

        // TC15: StorageBox setter
        StorageBox<Book> box2 = new StorageBox<>(b1);
        box2.setItem(b2);
        System.out.println(box2.getItem().getTitle());
        // Expected: Physics
    }
}
enum Department{
    GENERAL,SCIENCE,ARTS,LAW;
}
enum LoanStatus{
    PENDING,APPROVED,ISSUED,RETURNED;
}
abstract class Person{
    protected String name;
    protected String memberId;
    public Person(String name,String memberId){
        this.name=name;
        this.memberId=memberId;
    }
    public abstract void displayRole();
    public void setName(String name){
        this.name=name;
    }
    public void setMemberId(String memberId){
        this.memberId=memberId;
    }
    public String getName(){
        return name;
    }
    public String getMemberId(){
        return memberId;
    }
}
class Member extends Person{
    public Member(String name,String id){
        super(name,id);
    }
    @Override
    public void displayRole(){
        System.out.println("Role: Member");
    }
}
class Librarian extends Person{
    private Department department;
    public Librarian(String name,String Id){
        super(name,Id);
        this.department=Department.GENERAL;
    }
    public Librarian(String name,String Id,Department dep){
        super(name,Id);
        this.department=dep;
    }
    @Override
    public void displayRole(){
        System.out.println("Role: Librarian");
    }
    public void setDepartment(Department dep){
        this.department=dep;
    }
    public Department getDepartment(){
        return department;
    }
}
class Book{
    private String title;
    private double price;
    private String author;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    public Book(String title,double price,String author){
        this.title=title;
        this.price=price;
        this.author=author;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
}
class Loan{
    private Member member;
    private List<Book> books;
    private LoanStatus loanStatus;
    public Loan(Member member,List<Book>book){
        this.member=member;
        this.books=book;
        this.loanStatus=LoanStatus.PENDING;
    }
    public Loan(Member member){
        this.member=member;
        this.books=new ArrayList<>();
        this.loanStatus=LoanStatus.PENDING;
    }
    public void setMember(Member member){
        this.member=member;
    }
    public void setBooks(List<Book>book){
        this.books=book;
    }
    public void setLoanStatus(LoanStatus ls){
        this.loanStatus=ls;
    }
    public List<Book> getBooks(){
        return books;
    }
    public Member getMember(){
        return member;
    }
    public LoanStatus getLoanStatus(){
        return loanStatus;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void addBook(Book book,int quantity){
        for(int i=0;i<quantity;i++){
            books.add(book);
        }
    }
    public void loanSummary(){
        System.out.println("Loan Summary: ");
        System.out.println("Status: "+this.loanStatus);
        for(Book b:books){
            System.out.println("Book: "+b.getTitle()+" --- Price: "+b.getPrice());
        }
    }
}
class StorageBox<T>{
    private T item;
    public StorageBox(T item){
        this.item=item;
    }
    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return item;
    }
}
