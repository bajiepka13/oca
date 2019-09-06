package programmingPatterns.remotecontrol;

public class Application {

    private static final int MAGNITOFON_COMMANDS = 1;
    private static final int STEREO_MACROS = 2;

    public static void main(String[] args) {

        Stereo samsung = new Stereo();

        RemoteControl remote = new RemoteControl();
        Command turnOnStereo = new StereoOnWithCDCommand(samsung);
        Command turnOffStereo = new StereoOffWithCDCommand(samsung);

        remote.bothButtons(MAGNITOFON_COMMANDS, turnOnStereo, turnOffStereo);

        MacroCommand macrosOn = new MacroCommand(new Command[]{turnOnStereo, turnOffStereo});
        MacroCommand macrosOff = new MacroCommand(new Command[]{turnOffStereo, turnOnStereo});

        remote.bothButtons(STEREO_MACROS, macrosOn, macrosOff);

        remote.onButtion(STEREO_MACROS);
        remote.offButtion(STEREO_MACROS);

        System.out.println(remote.toString());
    }
}
