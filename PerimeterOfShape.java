class Perimeter {

    int length, breadth, side;
    float radius;

    int peri(int side) {
        return 4 * side;
    }

    int peri(int length, int breadth) {
        return (2 * (length + breadth));
    }

    float peri(float radius) {
        return (2 * (22 / 7) * radius);
    }
}

public class PerimeterOfShape {
    public static void main(String[] args) {

        Perimeter p1 = new Perimeter();
        int Square = p1.peri(4);
        System.out.println("Perimeter of Square: " + Square);

        Perimeter p2 = new Perimeter();
        int rectangle = p2.peri(10, 10);
        System.out.println("Perimeter of Rectangle is: " + rectangle);

        Perimeter p3 = new Perimeter();
        float circle = p3.peri(22.5f);
        System.out.println("Perimeter of Circle is: " + circle);
    }
}
