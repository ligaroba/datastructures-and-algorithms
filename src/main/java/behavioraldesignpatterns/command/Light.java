package behavioraldesignpatterns.command;

// Reciever
public class Light {
    private boolean isOn = false;
    public boolean isOn(){
        return isOn;
    }

    public void toggle(){
        if(isOn){
            off();
            isOn=false;
        }else{
            on();
            isOn=true;
        }
    }
    public void on(){
        System.out.println("Lights switched on");
    }
    public void off(){
        System.out.println("Lights switched off ");
    }
}
