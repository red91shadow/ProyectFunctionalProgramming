package controller;



import model.Circle;
import model.Square;
import model.Triangle;
import view.ShapeView;

public class Controller {

    public void drawSquare(ShapeView shapeView) {
        shapeView.setShape(new Square());
    }

    public void drawTriangle(ShapeView shapeView) {
        shapeView.setShape(new Triangle());
    }

    public void drawCircle(ShapeView shapeView) {
        shapeView.setShape(new Circle());
    }
}
