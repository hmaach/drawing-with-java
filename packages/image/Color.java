package packages.image;
import java.util.Random;

public class Color {
    public int r, g, b;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getRGB() {
        return (255 << 24) | (this.r << 16) | (this.g << 8) | this.b;
    }

    public static Color getRandomRGB() {
        Random rand = new Random();
        return new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }
}