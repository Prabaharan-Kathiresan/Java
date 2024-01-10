public class Low implements FanSpeed {
    public void pull(CeilingFan fan) {
        System.out.println("Medium");
        fan.state = new Medium();
    }
}