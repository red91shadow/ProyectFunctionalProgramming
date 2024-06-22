import view.Ventana;

import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller shapeController = new Controller();
        Ventana ventana = new Ventana(shapeController);
        ventana.setVisible(true);
    }
}

