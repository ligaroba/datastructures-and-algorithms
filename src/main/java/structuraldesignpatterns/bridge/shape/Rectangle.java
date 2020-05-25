package structuraldesignpatterns.bridge.shape;

public class Rectangle extends Shape{

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
