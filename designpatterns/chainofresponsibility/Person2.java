public class Person2 {
    public static void main(String args[]) {
        Zeroprocessor zero = new Zeroprocessor();
        zero.addProcessor(new PositiveProcessor());
        zero.addProcessor(new NegativeProcessor());
      
        
        zero.execute(0);
        zero.execute(10);
        zero.execute(-10);
    }

}