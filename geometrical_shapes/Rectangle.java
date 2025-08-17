package geometrical_shapes;

import interfaces.Displayable;
import interfaces.Drawable;
import java.awt.Color;

public class Rectangle implements Drawable {

    private final Point topLeft;
    private final Point bottomRight;
    private final Color color = Color.RED;

    public Rectangle(Point p1, Point p2) {
        this.topLeft = p1;
        this.bottomRight = p2;
    }

    @Override
    public void draw(Displayable displayable) {
        Point p3 = new Point(bottomRight.getX(), topLeft.getY());
        Point p4 = new Point(topLeft.getX(), bottomRight.getY());

        new Line(topLeft, p3).draw(displayable);
        new Line(p3, bottomRight).draw(displayable);
        new Line(bottomRight, p4).draw(displayable);
        new Line(p4, topLeft).draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
