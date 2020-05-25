package behavioraldesignpatterns.visitor.visitor;

import java.util.List;

public class AtvPartShippingVisitor implements AtvPartVisitor {
    double shippingAmount=0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount+=15;
        System.out.println(" Wheel are bulky an expensive to ship");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount+=9;
        System.out.println("Oil are hazardous and has a fee to ship");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount+=3;
        System.out.println("Fender are Light and cheap to ship");
    }

    @Override
    public void visit(PartOrder order) {
        System.out.println("If they shop for more than three items we give them a shipping discount");
        List<AtvParts> parts =order.getParts();
        if(parts.size()>3){
            shippingAmount-=5;
        }
        System.out.println("Shipping Amount is : " + shippingAmount);

    }
}
