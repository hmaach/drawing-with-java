package packages.shapes;

import packages.image.*;

class Line implements Drawable {
    private Point a, b;
    private Color color;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.color = Color.getRandomRGB();
    }

    public Line(Point a, Point b, Color color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public void draw(Displayable displayable) {
        int x1 = a.x, y1 = a.y;
        int x2 = b.x, y2 = b.y;

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;

        while (true) {
            displayable.display(x1, y1, color);
            if (x1 == x2 && y1 == y2)
                break;
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

    public Color getColor() {
        return this.color;
    }
}
