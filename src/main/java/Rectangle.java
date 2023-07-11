public class Rectangle {

    int length;
    int width;
    int area;
    boolean isSquare = false;

    public int getArea() {
        area = length * width;
        return area;
    }

    public boolean square(){
        if (length == width) //ask
            isSquare = true;
        return isSquare;
    }

}
