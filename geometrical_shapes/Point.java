package geometrical_shapes;

import interfaces.Displayable;
import interfaces.Drawable;
import java.awt.Color;
import utils.ColorUtils;

public class Point implements Drawable {

    private final int x;
    private final int y;
    private Color color = ColorUtils.random();

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(this.x, this.y, this.color);
    }
}
