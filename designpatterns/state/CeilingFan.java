public class CeilingFan {
    public FanSpeed state = new Off();

    public void pull() {
       state.pull(this);
    }   
} 



