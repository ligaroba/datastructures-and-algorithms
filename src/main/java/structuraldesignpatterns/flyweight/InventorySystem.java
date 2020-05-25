package structuraldesignpatterns.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private final Catalog catalog =new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();

    void takeOrder(String itemName , int orderNumber){
        Item item= catalog.lookUp(itemName);
        Order order= new Order(orderNumber,item);
        orders.add(order);

    }
    void process(){
        for (Order order : orders){
            order.processingOrder();
            orders.remove(order);
        }
    }

    String report(){
        return " \n Total Item objects made : " +
                catalog.totalItemMode();
    }
}
