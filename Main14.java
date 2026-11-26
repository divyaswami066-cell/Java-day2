class Rectangle {
    double length;
    double width;

    Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    Rectangle(double side) {
        length = side;
        width = side;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }
}

public class Main14 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0);
        Rectangle r3 = new Rectangle(4.0, 6.0);

        r1.calculateArea();
        r2.calculateArea();
        r3.calculateArea();
    }
}