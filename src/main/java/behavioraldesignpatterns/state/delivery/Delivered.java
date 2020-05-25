package behavioraldesignpatterns.state.delivery;

public class Delivered implements PackageState{

    //Singleton
    private static Delivered instance = new Delivered();
    private Delivered(){}

    public static Delivered getInstance(){
        return instance;
    }

    // Business Logic
    @Override
    public void updateState(DeliveryContext context) {
        System.out.println("Package Delivered ");
    }
}
