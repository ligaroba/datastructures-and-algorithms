package structuraldesignpatterns.bridge.shape;

public class Green implements Color{

    @Override
    public void applyColor() {
        System.out.println("Applying Green");
    }
}
