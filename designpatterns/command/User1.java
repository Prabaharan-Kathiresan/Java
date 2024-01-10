public class User1 {
    public static void main(String args[]) {
        RemoteControl remote = new RemoteControl();
        Light streetLight1 = new Light("Street Light 1");        
        LightOnCommand streetLight1Command = new LightOnCommand(streetLight1);        
        remote.setCommand(streetLight1Command);        
        remote.onOffCommandPressed();

        Light streetLight2 = new Light("Street Light 2");
        LightOffCommand streetLight2Command = new LightOffCommand(streetLight2);
        remote.setCommand(streetLight2Command);
        remote.onOffCommandPressed();
    }
}