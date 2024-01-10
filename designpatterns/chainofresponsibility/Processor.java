public abstract class Processor {
    
    Processor nextProcessor;

    public abstract void execute(int number);
 
    public void process(int number) {
        if(nextProcessor!=null) {
            nextProcessor.execute(number);
        }
    }

    public void addProcessor(Processor newProcessor) {
        if(nextProcessor == null) {
            nextProcessor = newProcessor;
        } else { 
            Processor lastProcessor = nextProcessor ;
            while(lastProcessor.nextProcessor!=null) {
                lastProcessor = lastProcessor.nextProcessor;
            } 
            lastProcessor.nextProcessor=newProcessor;
        }
     }
    
}
