package behavioraldesignpatterns.visitor.visitorbad;

public class Fender implements AtvParts{
    @Override
    public double calculateShipping() {
        return 3;
    }
}
