public class Off implements FanSpeed {
    public void pull(CeilingFan fan) {
        System.out.println("Low");
        fan.state = new Low();
    }
}