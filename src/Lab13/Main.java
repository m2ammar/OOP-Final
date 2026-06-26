package Lab13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(4);
        list1.add(7);
        list1.add(2);
        list1.add(3);

        // create a new arrayList list2 which must contain only even numbers from list1

        List<Integer> list2 = new ArrayList<>();
        for (int i=0; i<list1.size(); i++){
            if (list1.get(i)%2==0){
                list2.add(list1.get(i));
            }
        }
        System.out.println(list2);

        List<Integer> list3 = list1.stream().filter(x -> x%2==0).toList(); // lamda expression: -> leftside of the expression is parameter.
        System.out.println(list3);

        //extract numbers less than 5 from list1
        List<Integer> list4 = list1.stream().filter(x -> x<5).toList();
        System.out.println(list4);

        System.out.println(list1);

        //square each number in list1 and store in list5
        List<Integer> list5 = new ArrayList<>();
        for (int i=0; i<list1.size(); i++){
            list5.add(list1.get(i) * list1.get(i));
        }
        System.out.println(list5);

        List<Integer> list55 = list1.stream().map(x -> x * x).toList();
        System.out.println(list55);

        // cube each number in list1 and store in list6
        List<Integer> list6 = list1.stream().map(x -> x*x*x).toList();
        System.out.println(list6);

        //double each number
        List<Integer> list7 = list1.stream().map(x -> x*2).toList();
        System.out.println(list7);

        //Sum of all numbers in list1
        int sum=list1.stream().reduce(0,(x,y) -> x + y);

        int result=0;
        for(int x : list1){
            result += x;
        }
        System.out.println(result);

        List<Integer> list8 = list1.stream().map(Calculator::square).toList();

        List<Integer> list9 = list1.stream().filter(x -> x%2==0).map(x -> x*x).toList();
        System.out.println(list9);

        list1.stream().forEach(x -> System.out.print(x + " ")); // foreach use only for void which doesn't return anything.


    }

    public static boolean isEven(int number){
        return number % 2 ==0;
    }
}