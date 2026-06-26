package midsquestions;

public class Triangle {

    private MyPoint a,b,c;

    public Triangle(MyPoint a, MyPoint b, MyPoint c){
        //x_a(y_b - y_c) + x_b(y_c - y_a) + x_c(y_a - y_b) == 0

         if (a.getX()*(b.getY() - c.getY()) + b.getX()*(c.getY() - a.getY())+  c.getX()*(a.getY() - b.getY()) == 0){

            this.a= new MyPoint(0,0);
            this.b= new MyPoint(0,0);
            this.c=new MyPoint(0,0);
          return;
        }else{

            this.a=a;
            this.b=b;
            this.c=c;
        }
    }

    public double getArea(){

        double area =
        a.getX() * (b.getY() - c.getY() ) +
        b.getX() * (c.getY() - a.getY()) +
        c.getX() * (a.getY() -b.getY());

        area = Math.abs(area/2);
        return area;
    }
}
