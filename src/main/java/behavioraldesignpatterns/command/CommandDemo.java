package behavioraldesignpatterns.command;

import java.util.ArrayList;
import java.util.List;

//Client
public class CommandDemo {
    public static void main(String[] args) {
        Light livingRoomLight =new Light(); // Reciever
        Light bedRoomLight =new Light(); // Reciever
        Switch lightSwitch = new Switch();// Invoker

        /*Command toggleCommand = new ToggleCommand(bedRoomLight); // to switch the light on/off
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);(/
        */

        List<Light> allLightsList= new ArrayList<>();
        allLightsList.add(livingRoomLight);
        allLightsList.add(bedRoomLight);
        Command allLightsCommand = new AllLightsCommand(allLightsList);
        lightSwitch.storeAndExecute(allLightsCommand);


    }
}
