package programmingPatterns.command;

public class GarageDoor {

    public void up(){
        System.out.println("Дверь поднимается");
    }

    public void down(){
        System.out.println("Дверь опускается");
    }

    public void stop(){
        System.out.println("Остановка");
    }

    public void lightOn(){
        System.out.println("Включается свет");
    }

    public void lightOff(){
        System.out.println("Свет выключается");
    }
}
