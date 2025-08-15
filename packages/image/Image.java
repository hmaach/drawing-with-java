package packages.image;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;




public class Image implements Displayable {
    private BufferedImage image;
    private int width, height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void display(int x, int y, Color color) {
        image.setRGB(x, y, color.getRGB());
    }

    public void save(String filename) {
        try {
            ImageIO.write(image, "png", new File(filename));
            System.out.println("Saved image: " + filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
