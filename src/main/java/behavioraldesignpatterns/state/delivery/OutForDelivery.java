package behavioraldesignpatterns.state.delivery;



public class OutForDelivery implements PackageState{
    //Singleton
    private static OutForDelivery instance = new OutForDelivery();

    private OutForDelivery(){}

    public static OutForDelivery getInstance(){
        return instance;
    }

    // Business Logic and state transition

    @Override
    public void updateState(DeliveryContext context) {
        System.out.println("Package Out for delivery  ");
        context.setCurrentState(Delivered.getInstance());
    }
}
