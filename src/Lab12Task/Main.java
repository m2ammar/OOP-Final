package Lab12Task;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//create a student class with at least 3 attributes, then make arraylist of at least 5 students in main
// method and pass this arraylist to your WildCardExample class print method

        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student(1, "Ammar", "Fall 2025"));
        s.add(new Student(2, "Sara", "Fall 2025"));
        s.add(new Student(3, "Raza", "Spring 2026"));
        s.add(new Student(4, "Hadi", "Spring 2026"));
        s.add(new Student(5, "Ahmed", "Fall 2025"));
//        System.out.println(s);



        WildCardExample w = new WildCardExample();
        w.print(s);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(33);
        w.sumNumbers(list);

    }
}
