package programmingPatterns.command;

public class GarageDoorOpenCommand implements Command {

    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.lightOn();
        door.up();
        door.stop();
        System.out.println("Дверь открыта");
    }
}
