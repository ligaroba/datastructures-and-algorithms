package behavioraldesignpatterns.visitor.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        PartOrder order = new PartOrder();
        order.addParts(new Wheel());
        order.addParts(new Fender());
        order.addParts(new Oil());

        //double shippingCost =order.calculateShipping();
        //System.out.println("shippingCost : "  + shippingCost);

        order.accept(new AtvPartShippingVisitor());
        order.accept(new AtvPartDisplayVisitor());

    }
}
