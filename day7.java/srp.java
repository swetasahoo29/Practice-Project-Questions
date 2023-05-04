//SOLID principles are an object-oriented approach that are applied to software structure design.
//single responsibility principle- a class should only have one responsibility and only one reason to change
class Rectangle { 
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int Area() {
        return width * length;
    }
    // only things related to dimensions of the rectangle should come here
}

class RectangleColor {
    public void color(Rectangle rectangle) {
        System.out.println("Printing color of rectangle");
    }
    public void printColor(Rectangle rectangle) {
        System.out.println("Rectangle colors...");
    }
    // printing for color of rectangle
}

public class srp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        RectangleColor rectangleColor = new RectangleColor();

        rectangleColor.color(rectangle);
        rectangleColor.printColor(rectangle);
    }
}