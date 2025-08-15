package packages.shapes;

import packages.image.*;

public class Triangle implements Drawable {
    private Point p1, p2, p3;
    private Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = Color.getRandomRGB();
    }

    public Triangle(Point p1, Point p2, Point p3, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void draw(Displayable displayable) {
        Line p1_p2 = new Line(p1, p2, this.getColor());
        p1_p2.draw(displayable);
        Line p2_p1 = new Line(p2, p3, this.getColor());
        p2_p1.draw(displayable);
        Line p3_p1 = new Line(p3, p1, this.getColor());
        p3_p1.draw(displayable);
    }
}
