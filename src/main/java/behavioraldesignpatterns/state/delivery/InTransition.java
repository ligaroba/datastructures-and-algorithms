package behavioraldesignpatterns.state.delivery;

public class InTransition implements PackageState{
    //Singleton
    private static InTransition instance = new InTransition();
    private InTransition(){}

    public static InTransition getInstance(){
        return instance;
    }

    //Business Logic and State Transition
    @Override
    public void updateState(DeliveryContext context) {
        System.out.println("Package is in transition ");
        context.setCurrentState(OutForDelivery.getInstance());
    }
}
