package programmingPatterns.remotecontrol;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("(Нажатие кнопки) ничего не происходит.");
    }

    @Override
    public void undo() {
        System.out.println("(Отмена действия) ничего не происходит.");
    }
}
