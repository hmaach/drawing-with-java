package interfaces;

import java.awt.Color;

public interface Displayable {

    void display(int x, int y, Color color);

    void save(String filename);
}
