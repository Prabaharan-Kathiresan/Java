public class MathsProcessor implements Processor {
    Processor nextprocessor;
	
  public void read(String book) {
	if(book.equalsIgnoreCase("Maths")) {
		System.out.println("reading Maths book");
	} 
	if(nextprocessor !=null) {
		nextprocessor.read(book);
	}
  }
  
     public void addProcessor(Processor nextprocessor) {
	  this.nextprocessor = nextprocessor;
  }
}