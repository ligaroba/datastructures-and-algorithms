package structuraldesignpatterns.flyweight;

import structuraldesignpatterns.flyweight.Item;

public class Order {
    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }
    void processingOrder(){
        System.out.println("Ordering Item " + item + " for order Number " + orderNumber);
    }
}
