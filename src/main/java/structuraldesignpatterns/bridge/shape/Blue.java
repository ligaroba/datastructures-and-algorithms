package structuraldesignpatterns.bridge.shape;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Blue ");
    }
}
