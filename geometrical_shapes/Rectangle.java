package geometrical_shapes;

import interfaces.Displayable;
import interfaces.Drawable;
import java.awt.Color;
import utils.ColorUtils;

public class Rectangle implements Drawable {

    private final Point topLeft;
    private final Point bottomRight;
    private final Color color;

    public Rectangle(Point p1, Point p2) {
        this.topLeft = p1;
        this.bottomRight = p2;
        this.color = ColorUtils.random();
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void draw(Displayable displayable) {
        Point p3 = new Point(bottomRight.getX(), topLeft.getY());
        Point p4 = new Point(topLeft.getX(), bottomRight.getY());

        new Line(topLeft, p3, this.color).draw(displayable);
        new Line(p3, bottomRight, this.color).draw(displayable);
        new Line(bottomRight, p4, this.color).draw(displayable);
        new Line(p4, topLeft, this.color).draw(displayable);
    }
}
