package structuraldesignpatterns.decorator;

public class SimpleSandWich implements Sandwich {
    @Override
    public String make() {
        return "Bread ";
    }
}
