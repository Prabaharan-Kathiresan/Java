public class High implements FanSpeed {
    public void pull(CeilingFan fan) {
        System.out.println("off");
        fan.state = new Off();
    }
}