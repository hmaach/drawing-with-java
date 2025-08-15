
import packages.image.*;
import packages.shapes.*;
import packages.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);
        Circle circle = new Circle(new Point(400, 500), 200);
        circle.draw(image);

        // for (int i = 0; i < 50; i++) {
        // Circle circle = Circle.random(image.getWidth(), image.getHeight());
        // circle.draw(image);
        // }
        image.save("image.png");
    }
}