package model;

import interfaces.Shape;
import java.awt.*;

public class Circle implements Shape {
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        int x = 200;
        int y = 200;
        int diameter = 100;
        g.fillOval(x - diameter / 2, y - diameter / 2, diameter, diameter);
    }
}
