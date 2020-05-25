package behavioraldesignpatterns.state.delivery;

public class Shipped implements PackageState{

    //Singleton
    private static Shipped instance =new Shipped();
    private Shipped(){}

    public static Shipped getInstance(){
        return instance;
    }
    // Business Logic and state transition

    @Override
    public void updateState(DeliveryContext context) {
        System.out.println("Package Shipped ");
        context.setCurrentState(InTransition.getInstance());
    }
}
