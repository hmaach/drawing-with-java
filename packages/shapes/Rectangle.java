package packages.shapes;

import packages.image.*;

public class Rectangle implements Drawable {
    private Point topLeft, bottomRight;
    private Color color;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = Color.getRandomRGB();
    }

    public Rectangle(Point topLeft, Point bottomRight, Color color) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void draw(Displayable displayable) {
        int left = this.topLeft.x;
        int right = this.bottomRight.x;
        int top = this.topLeft.y;
        int bottom = this.bottomRight.y;

        for (int x = left; x <= right; x++) {
            displayable.display(x, top, this.getColor());
            displayable.display(x, bottom, this.getColor());
        }

        for (int y = top; y <= bottom; y++) {
            displayable.display(left, y, this.getColor());
            displayable.display(right, y, this.getColor());
        }
    }
}
