

public class PositiveProcessor extends Processor{

    @Override
    public void execute(int number) {
        if(number > 0 ) {
            System.out.println("PositiveProcessor::Number is Positive::"+number);
        }
        
        super.process(number);
        
    }
    
}
