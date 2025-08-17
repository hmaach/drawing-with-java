package geometrical_shapes;

import interfaces.Displayable;
import interfaces.Drawable;
import java.awt.Color;
import utils.ColorUtils;

public class Triangle implements Drawable {

    private final Point p1, p2, p3;
    private final Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = ColorUtils.random();
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void draw(Displayable displayable) {
        new Line(p1, p2, this.color).draw(displayable);
        new Line(p2, p3, this.color).draw(displayable);
        new Line(p3, p1, this.color).draw(displayable);
    }
}
