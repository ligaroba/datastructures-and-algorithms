package structuraldesignpatterns.bridge.shape;


// Implementation using Composition
public class BridgeShapeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape square = new Square(blue);
        square.applyColor();

        Color green = new Green();
        Shape greenSquare = new Square(green);
        greenSquare.applyColor();
    }
}
