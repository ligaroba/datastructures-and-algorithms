package behavioraldesignpatterns.visitor.visitor;

public class Oil implements AtvParts {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
