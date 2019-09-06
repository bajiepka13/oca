package programmingPatterns.command;

import java.util.function.Function;

public class Application {

    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightsOnCommand lightsOn = new LightsOnCommand(light);

        remote.setSlot(lightsOn);
        remote.buttonWasPressed();

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand openGarage = new GarageDoorOpenCommand(door);

        remote.setSlot(openGarage);
        remote.buttonWasPressed();
    }
}
