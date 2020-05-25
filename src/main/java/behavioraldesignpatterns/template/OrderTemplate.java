package behavioraldesignpatterns.template;

public abstract  class OrderTemplate {
    public Boolean isGift=true; // Hook doesnt really need to be overriden
    // Operations that needs to be oeverriden
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReciept();
    public abstract void doDelivery();

    public final void wrapGift(){
        System.out.println("Gift wrapped");
    }

    public final void processOrder(){
        doCheckout();
        doPayment();
        if(isGift){
            wrapGift();
        }else{
            doReciept();
        }
        doDelivery();
    }

}
