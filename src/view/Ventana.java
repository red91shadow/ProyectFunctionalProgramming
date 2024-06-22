package view;

import controller.Controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Ventana extends JFrame {

    private JPanel panel;
    private ShapeView shapeView;
    private Controller shapeController;

    public Ventana(Controller shapeController) {
        this.shapeController = shapeController;
        setSize(750, 500);
        setTitle("Proyecto Figuras Funcional");
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.green);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setLayout(null);
        getContentPane().add(panel);

        colocarBotones();

        shapeView = new ShapeView();
        shapeView.setBackground(Color.BLACK);
        shapeView.setBounds(200, 50, 400, 400);
        panel.add(shapeView);
    }

    private void colocarBotones() {
        JButton boton1 = new JButton("Cuadrado");
        boton1.setBounds(10, 50, 100, 40);
        boton1.addActionListener(e -> shapeController.drawSquare(shapeView));
        panel.add(boton1);

        JButton boton2 = new JButton("Triangulo");
        boton2.setBounds(10, 100, 100, 40);
        boton2.addActionListener(e -> shapeController.drawTriangle(shapeView));
        panel.add(boton2);

        JButton boton3 = new JButton("Circulo");
        boton3.setBounds(10, 150, 100, 40);
        boton3.addActionListener(e -> shapeController.drawCircle(shapeView));
        panel.add(boton3);
    }
}
