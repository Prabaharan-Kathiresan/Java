public class CeilingFan {

    public int state = 0;

    public void pull() {
        if(state == 0) {
            System.out.println("Low Speed");
            state = 1;
        }
        else if(state ==1 ) {
            System.out.println("Medium Speed");
            state = 2;
        } 
        else if(state == 2) { 
            System.out.println("High Speed");
            state = 3;
        }  else if(state == 3) {
            System.out.println("off");
            state = 0;
        }
    }
}