package LabTask13march;

public class Main1 {
      public static void main(String[] args){


          Library l1 = Library.makeObject("City Library", 500, "Karachi");
          Library l2 = Library.makeObject("City Library", 500, "Karachi");
          Library l3 = Library.makeObject("City Library", 500, "Karachi");
          Library l4 = Library.makeObject("City Library", 500, "Karachi");


          System.out.println(l1.getName() +" "+ l1.getNoOfBooks() +" "+ l1.getAddress());
          System.out.println(l2.getName() +" "+ l2.getNoOfBooks() +" "+ l2.getAddress());
          System.out.println(l3.getName() +" "+ l3.getNoOfBooks() +" "+ l3.getAddress());
          if(l4 != null) {
              System.out.println(l4.getName() + " " + l4.getNoOfBooks() + " " + l4.getAddress());
          }else{
              System.out.println("Can't create more than 3 objects");
          }

      }
}



