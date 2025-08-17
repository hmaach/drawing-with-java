package geometrical_shapes;

import interfaces.Displayable;
import interfaces.Drawable;
import java.awt.Color;
import java.util.Random;
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

    public static Point random(int width, int height) {
        Random rand = new Random();
        int x = rand.nextInt(width);
        int y = rand.nextInt(height);

        return new Point(x, y);
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
