package behavioraldesignpatterns.command;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> allLightsList) {
        this.lights=allLightsList;
    }

    @Override
    public void execute() {
        for (Light light: lights) {
              if(light.isOn())
                light.toggle();
        }
    }
}
