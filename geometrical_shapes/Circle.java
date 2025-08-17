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
        int radius = rand.nextInt(width);
        Point center = Point.random(width, height);

        return new Circle(center, radius);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void draw(Displayable displayable) {

        int center_x = this.center.getX();
        int center_y = this.center.getY();
        int raduis = this.radius;

        int x = 0;
        int y = -raduis;

        while (x < (-y)) {
            double y_mid = y + 0.5;
            if (Math.pow(x, 2) + Math.pow(y_mid, 2) > Math.pow(radius, 2)) {
                y += 1;
            }

            displayable.display(center_x + x, center_y + y, this.color);
            displayable.display(center_x - x, center_y + y, this.color);
            displayable.display(center_x + x, center_y - y, this.color);
            displayable.display(center_x - x, center_y - y, this.color);
            displayable.display(center_x + y, center_y + x, this.color);
            displayable.display(center_x - y, center_y + x, this.color);
            displayable.display(center_x + y, center_y - x, this.color);
            displayable.display(center_x - y, center_y - x, this.color);

            x += 1;
        }
    }
}
