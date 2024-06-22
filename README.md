# Proyecto de Dibujo de Formas en Java

Este proyecto es una aplicación gráfica simple en Java que dibuja diferentes formas (cuadrado, triángulo, y círculo) en respuesta a la interacción del usuario. La aplicación sigue los principios de MVC (Model-View-Controller) y SOLID, y utiliza programación funcional en la medida de lo posible.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- `controller`: Contiene la lógica de control.
- `model`: Contiene las clases de modelo que representan las formas.
- `view`: Contiene las clases de vista que manejan la interfaz de usuario.

### Paquetes y Clases

1. **controller**
   - `Controller.java`: Controlador que gestiona la lógica de dibujo de las formas.

2. **model**
   - `Shape.java`: Interfaz que define el método `draw`.
   - `Circle.java`: Clase que implementa `Shape` para dibujar un círculo.
   - `Square.java`: Clase que implementa `Shape` para dibujar un cuadrado.
   - `Triangle.java`: Clase que implementa `Shape` para dibujar un triángulo.

3. **view**
   - `ShapeView.java`: Panel personalizado que dibuja la forma seleccionada.
   - `Ventana.java`: Ventana principal que contiene los botones y el panel de dibujo.

### Main
- `Main.java`: Punto de entrada de la aplicación.

## Instrucciones de Uso

### Requisitos

- Java Development Kit (JDK) 8 o superior.

### Compilación y Ejecución

1. Clona o descarga este repositorio.
2. Abre una terminal y navega hasta el directorio del proyecto.
3. Compila el proyecto con el siguiente comando:
    ```sh
    javac -d bin -sourcepath src src/Main.java
    ```
4. Ejecuta la aplicación con el siguiente comando:
    ```sh
    java -cp bin Main
    ```

## Funcionamiento

- Al ejecutar la aplicación, se abrirá una ventana con tres botones: "Cuadrado", "Triangulo" y "Circulo".
- Al presionar uno de los botones, se dibujará la forma correspondiente en el panel negro de la ventana.

## Principios Aplicados

- **MVC (Model-View-Controller)**: Separación clara de responsabilidades entre la lógica de negocio (modelo), la interfaz de usuario (vista) y la lógica de control.
- **SOLID**: Cada clase tiene una única responsabilidad, el código es abierto a extensión pero cerrado a modificación, y se utilizan interfaces para la dependencia de abstracciones.
- **Programación Funcional**: Uso de `Optional` para manejar la forma seleccionada y evitar null pointers.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, crea un fork de este repositorio y envía un pull request con tus cambios.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
