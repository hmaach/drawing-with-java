package geometrical_shapes;


import interfaces.Displayable;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    private final BufferedImage img;

    public Image(int width, int height) {
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    @Override
    public void display(int x, int y, Color color) {
        if (x >= 0 && x < img.getWidth() && y >= 0 && y < img.getHeight()) {
            img.setRGB(x, y, color.getRGB());
        }
    }

    @Override
    public void save(String filename) {
        try {
            ImageIO.write(img, "png", new File(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getWidth() { return img.getWidth(); }
    public int getHeight() { return img.getHeight(); }
}
