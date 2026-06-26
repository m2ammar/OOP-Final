public class MyRectangle {

    private MyPoint topLeft;
    private double height;
    private double width;
    private double area;
    private double perimeter;

    public MyRectangle(MyPoint topLeft, double height, double width){
        this.topLeft=topLeft;
        this.height=height;
        this.width=width;

        area=height*width;
        perimeter=2*(height + width);
    }

    public MyPoint getTopLeft(){
        return topLeft;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }
}
class MyPoint {
    private double x;
    private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}