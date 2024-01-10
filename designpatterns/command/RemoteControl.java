public class RemoteControl {
    Command onOffCommand;
    public void setCommand(Command command) {
        onOffCommand = command;
    }

    public void onOffCommandPressed() {
        onOffCommand.execute();
    }
}