package behavioraldesignpatterns.state.fan;

public class Fan {
    State fanLowState;
    State fanOffState;
    State fanMedState;
    State fanHighState;

    State state;

    public Fan(){
        fanOffState =new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);
        state=fanOffState;

    }
    public void pullChain(){
        state.handleRequest();
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public void setState(State state) {
        this.state = state;
    }
    public String toString(){
       return  state.toString();
    }
}
