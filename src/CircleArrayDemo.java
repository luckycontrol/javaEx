import java.util.ArrayList;

public class CircleArrayDemo {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();

        for(int i=0; i<5; i++) {
            circles.add(new Circle(i + 1.0));

            System.out.printf("원의 넓이: (반지름: %.1f) : %.2f\n", circles.get(i).getRadius(), circles.get(i).findArea());
        }
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }
}

