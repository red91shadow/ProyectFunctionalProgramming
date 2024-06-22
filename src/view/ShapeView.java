package view;


import interfaces.Shape;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Optional;

public class ShapeView extends JPanel {
    private Optional<Shape> shape = Optional.empty();

    public void setShape(Shape shape) {
        this.shape = Optional.of(shape);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shape.ifPresent(s -> s.draw(g));
    }
}
