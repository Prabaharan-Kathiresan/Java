public class Medium implements FanSpeed {
    public void pull(CeilingFan fan) {
        System.out.println("High");
        fan.state = new High();
    }
}