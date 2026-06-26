package GradingSystem;

public class Student {

   private String name;
   private double marks;
   private Grade grade;

   public Student(String name, double marks){
       this.name=name;
       this.marks=marks;
       assignGrade();
   }

   public void assignGrade(){
       if(marks >= 80){
           this.grade=Grade.A;
       }else if(marks >= 60){
           this.grade=Grade.B;
       }else if(marks >= 40){
           this.grade=Grade.C;
       }else {
           this.grade=Grade.F;
       }
   }

   public Grade getGrade(){
       return this.grade;
   }

   public String getReport(){

       return "Name: "+name+ " | Marks: "+marks+" | Grade: "+grade+" | "+ grade.getDescription();
   }

   public String getName(){
       return this.name;
   }

   public double getMarks(){
       return this.marks;
   }
}
