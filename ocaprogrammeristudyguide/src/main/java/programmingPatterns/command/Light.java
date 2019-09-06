package programmingPatterns.command;

public class Light {

    private Boolean on;

    public void on() {
        on = true;
        p();
    }

    public void off() {
        on = false;
        p();
    }

    private void p(){
        System.out.println(on == true ? "Свет горит!" : "Свет погашен");
    }
}
