package behavioraldesignpatterns.visitor.visitorbad;

public class Wheel implements AtvParts{
    @Override
    public double calculateShipping() {
        return 12;
    }
}
