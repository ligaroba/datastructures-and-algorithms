package behavioraldesignpatterns.state.delivery;

public class StatDeliveryDemo {
    public static void main(String[] args) {
        DeliveryContext context= new DeliveryContext(null, "Test123");
        context.update();
        context.update();
        context.update();
        context.update();
        context.update();
    }
}
