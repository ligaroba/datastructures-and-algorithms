package behavioraldesignpatterns.template;

public class WebOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("Get Items from the Cart ");
        System.out.println("Set Gift Preferences");
        System.out.println("Set Delivery address");
        System.out.println("Set Billing address ");

    }

    @Override
    public void doPayment() {
        System.out.println("Process Payment without card Present ");
    }

    @Override
    public void doReciept() {
        System.out.println("Email reciept ");

    }

    @Override
    public void doDelivery() {
        System.out.println("Shipp the Item the Address ");
    }
}
