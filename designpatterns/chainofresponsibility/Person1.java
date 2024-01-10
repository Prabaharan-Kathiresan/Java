public class Person1 {
    public static void main(String args[]) {
        Zeroprocessor zero = new Zeroprocessor();
        PositiveProcessor positive = new PositiveProcessor();
        NegativeProcessor negative  = new NegativeProcessor();

        zero.execute(0);
        positive.execute(0);
        negative.execute(0);

        zero.execute(10);
        positive.execute(10);
        negative.execute(10);
        
    }
}