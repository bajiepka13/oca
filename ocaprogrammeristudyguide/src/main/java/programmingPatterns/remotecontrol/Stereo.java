package programmingPatterns.remotecontrol;

public class Stereo {

    public void on() {
        System.out.println("Магнитофон включён.");
    }

    public void setSource(String source) {
        System.out.println("Магнитофон работает в режиме: " + source);
    }

    public void setVolume(int i) {
        System.out.println("Уровень громкости: " + i);
    }

    public void off() {
        System.out.println("Магнитофон выключен");
    }
}
