package behavioraldesignpatterns.visitor.visitor;

public class Wheel implements AtvParts {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
