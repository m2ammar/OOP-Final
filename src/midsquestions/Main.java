package midsquestions;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(new MyPoint(0,0), new MyPoint(4,0), new MyPoint(0,3));
        System.out.println("The required area of triangle: "+t.getArea());
    }
}
