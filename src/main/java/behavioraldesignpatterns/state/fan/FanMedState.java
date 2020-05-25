package behavioraldesignpatterns.state.fan;

public class FanMedState extends State {
    private Fan fan;
    public FanMedState(Fan fan){
        this.fan=fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning Fan to High");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is med";
    }
}
