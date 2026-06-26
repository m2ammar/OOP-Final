public class Rectangle {


    private int width;
    private int height;


    public boolean resize(int newWidth, int newHeight){

        if(newWidth >= 1 && newWidth <= 200 && newHeight >= 1 && newHeight <= 100){
            this.height=newHeight;
            this.width=newWidth;

            return true;
        }
        return false;
    }
}
