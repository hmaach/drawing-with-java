package geometrical_shapes;


import interfaces.Displayable;
import interfaces.Drawable;
import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private final Point center;
    private final int radius;
    private final Color color = Color.GREEN;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public static Circle random(int width, int height) {
        Random rand = new Random();
        Point center = new Point(rand.nextInt(width), rand.nextInt(height));
        int radius = rand.nextInt(50) + 10;
        return new Circle(center, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        int x0 = center.getX();
        int y0 = center.getY();
        int x = radius;
        int y = 0;
        int decisionOver2 = 1 - x;

        while (y <= x) {
            displayable.display(x0 + x, y0 + y, color);
            displayable.display(x0 + y, y0 + x, color);
            displayable.display(x0 - x, y0 + y, color);
            displayable.display(x0 - y, y0 + x, color);
            displayable.display(x0 - x, y0 - y, color);
            displayable.display(x0 - y, y0 - x, color);
            displayable.display(x0 + x, y0 - y, color);
            displayable.display(x0 + y, y0 - x, color);
            y++;
            if (decisionOver2 <= 0) {
                decisionOver2 += 2 * y + 1;
            } else {
                x--;
                decisionOver2 += 2 * (y - x) + 1;
            }
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}
