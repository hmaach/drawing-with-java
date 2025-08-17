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

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void draw(Displayable displayable) {
        int x1 = p1.getX(), y1 = p1.getY();
        int x2 = p2.getX(), y2 = p2.getY();

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;

        while (true) {
            displayable.display(x1, y1, color);
            if (x1 == x2 && y1 == y2) {
                break;
            }
            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
    }
}
