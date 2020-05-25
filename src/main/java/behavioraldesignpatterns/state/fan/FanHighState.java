package behavioraldesignpatterns.state.fan;

public class FanHighState extends State {
    private Fan fan;
    public FanHighState(Fan fan){
        this.fan=fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning Fan to Off");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is on High";
    }
}
