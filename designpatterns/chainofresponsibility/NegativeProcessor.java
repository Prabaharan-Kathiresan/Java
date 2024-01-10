
public class NegativeProcessor extends Processor{

    @Override
    public void execute(int number) {
        if(number < 0 ) {
            System.out.println("NegativeProcessor::Number is negative::"+number);
        }
        
        super.process(number);
    }
    
}
