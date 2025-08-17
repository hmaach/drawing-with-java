package utils;

import java.awt.Color;
import java.util.Random;

public class ColorUtils {

    private static final Random rand = new Random();

    public static Color random() {

        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        return new Color(r, g, b);
    }

}
