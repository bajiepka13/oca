package programmingPatterns.remotecontrol;

import java.util.Arrays;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl() {

        int commands = 7;

        onCommands = new Command[commands];
        offCommands = new Command[commands];

        Command noCommand = new NoCommand();
        for (int i = 0; i < commands; i ++ ) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void onButtion(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtion(int slot){
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void bothButtons(int i, Command onCommand, Command offCommand){
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }

    public void undoCommand(){
        undoCommand.undo();
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append("------ Пульт управления ------");
        for (int i = 0; i < onCommands.length; i++){
            sb.append("Слот: " + i + ":" +
                    onCommands[i].getClass().getName() + "   " +
                    offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
