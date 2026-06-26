package Lab12Task;

import java.util.ArrayList;

public class WildCardExample {

    public void print(ArrayList<?> list){
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public void printNumbers(ArrayList<? extends Number> list){
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    //Sum of all numbers
    public void sumNumbers(ArrayList<? extends Number> list){
        double sum = 0;
        for(int i=0; i< list.size(); i++){
            sum += list.get(i).doubleValue();
        }
        System.out.println(sum);
    }
}
