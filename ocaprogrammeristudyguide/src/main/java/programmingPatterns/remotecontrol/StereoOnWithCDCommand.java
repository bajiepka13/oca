package programmingPatterns.remotecontrol;

public class StereoOnWithCDCommand implements Command{

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setSource("CD");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
