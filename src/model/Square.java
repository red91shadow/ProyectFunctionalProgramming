package model;

import interfaces.Shape;
import java.awt.*;

public class Square implements Shape {
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(150, 150, 100, 100);
    }
}
