package geometrical_shapes;

import interfaces.Displayable;
import interfaces.Drawable;
import java.awt.Color;
import utils.ColorUtils;

public class Line implements Drawable {

    private final Point p1;
    private final Point p2;
    private final Color color;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = ColorUtils.random();
    }

    public Line(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    public static Line random(int width, int height) {
        Point p1 = Point.random(width, height);
        Point p2 = Point.random(width, height);

        return new Line(p1, p2);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void draw(Displayable displayable) {

        int start_x = p1.getX();
        int start_y = p1.getY();

        int end_x = p2.getX();
        int end_y = p2.getY();

        int dis_x = end_x - start_x; // distance between the x of start & end points
        int dis_y = end_y - start_y; // distance between the y of start & end points

        int steps = Math.max(Math.abs(dis_x), Math.abs(dis_y));

        double new_x = start_x;
        double new_y = start_y;

        double x_inc = dis_x / steps;
        double y_inc = dis_y / steps;

        for (int i = 0; i <= steps; i++) {
            displayable.display((int) Math.round(new_x), (int) Math.round(new_y), this.color);
            new_x += x_inc;
            new_y += y_inc;
        }
    }
}
