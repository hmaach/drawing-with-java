package geometrical_shapes;

import interfaces.Displayable;
import interfaces.Drawable;
import java.awt.Color;
import java.util.Random;
import utils.ColorUtils;

public class Circle implements Drawable {

    private final Point center;
    private final int radius;
    private final Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = ColorUtils.random();
    }

    public static Circle random(int width, int height) {
        Random rand = new Random();
        Point center = new Point(rand.nextInt(width), rand.nextInt(height));
        int radius = rand.nextInt(width);

        return new Circle(center, radius);
    }

    @Override
    public Color getColor() {
        return color;
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
}
