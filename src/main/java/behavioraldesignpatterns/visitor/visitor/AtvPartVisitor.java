package behavioraldesignpatterns.visitor.visitor;

public interface AtvPartVisitor {

    void visit(Wheel wheel);
    void visit(Oil oil);
    void visit(Fender fender);
    void visit(PartOrder partOrder);
}
