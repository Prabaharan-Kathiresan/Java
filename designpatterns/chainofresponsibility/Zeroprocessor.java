
/**
 * Zeroprocessor
 */
public class Zeroprocessor extends Processor{

     public void execute(int number) {
        if(number == 0) {
            System.out.println("ZeroProcessor::Number is Zero::"+number);
        }                     
        super.process(number);
     } 
     
     
}