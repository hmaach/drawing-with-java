package packages.shapes;

import packages.image.*;

public class Circle implements Drawable {
    private Point center;
    private int radius;
    private Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = Color.getRandomRGB();
    }

    public Circle(Point center, int radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void draw(Displayable displayable) {
        int x = radius;
        int y = 0;
        int decisionOver2 = 1 - x;

        while (y <= x) {
            displayable.display(this.center.x + x, this.center.y + y, this.getColor());
            displayable.display(this.center.x + y, this.center.y + x, this.getColor());
            displayable.display(this.center.x - y, this.center.y + x, this.getColor());
            displayable.display(this.center.x - x, this.center.y + y, this.getColor());
            displayable.display(this.center.x - x, this.center.y - y, this.getColor());
            displayable.display(this.center.x - y, this.center.y - x, this.getColor());
            displayable.display(this.center.x + y, this.center.y - x, this.getColor());
            displayable.display(this.center.x + x, this.center.y - y, this.getColor());

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