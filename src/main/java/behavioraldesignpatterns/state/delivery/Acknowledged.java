package behavioraldesignpatterns.state.delivery;

public class Acknowledged implements PackageState{
    // Singleton
    private static Acknowledged instance = new Acknowledged();
    private Acknowledged(){};
    public static Acknowledged getInstance(){
        return instance;
    }

    // Business Logic and state transition

    @Override
    public void updateState(DeliveryContext context) {
        System.out.println("Package is acknowledged");
        context.setCurrentState(Shipped.getInstance());
    }
}
