package behavioraldesignpatterns.state.fan;

public class FanLowState extends State {
    private Fan fan;
    public FanLowState(Fan fan){
        this.fan=fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning Fan to Med");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is on low";
    }
}
