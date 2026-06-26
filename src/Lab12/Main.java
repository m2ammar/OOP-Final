package Lab12;

import Lab12Task.WildCardExample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//          Box<Integer> box= new Box<>(1);
//          int temp = box.getValue();
//          Box<Double> box1= new Box<>(1.5);
//          int temp1 = (int)(double)box1.getValue();
//
//         Box<String> box2 = new Box<>("123");
//
//        AnotherBox<Integer> ab = new AnotherBox<>(2);
//        AnotherBox<Double> bc = new AnotherBox<>(3.3);
//        AnotherBox<Long> cd = new AnotherBox<>(2L);
//
        GenericMethod g = new GenericMethod();
//        g.print("SSSS");
//        g.printAll("ss");
//        g.printAll(6655);
//        g.printAll(true);
//        g.printAll(66.77);
//
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        g.printAll(list);
//
//        int[] a ={1,2,23,3,33,32,2,2};
//        g.printAll(a);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
//
//        WildCardExample w = new WildCardExample();


    }
}
