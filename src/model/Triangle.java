package model;

import interfaces.Shape;
import java.awt.*;

public class Triangle implements Shape {
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        int[] xPoints = {150, 200, 250};
        int[] yPoints = {250, 150, 250};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
