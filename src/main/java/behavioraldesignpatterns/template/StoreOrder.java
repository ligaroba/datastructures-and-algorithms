package behavioraldesignpatterns.template;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Ring up items from the Cart");
    }

    @Override
    public void doPayment() {
        System.out.println("Process Payment with card Present");
    }

    @Override
    public void doReciept() {
        System.out.println("Print Reciept");
    }

    @Override
    public void doDelivery() {
        System.out.println("Bag items at the counter ");
    }
}
