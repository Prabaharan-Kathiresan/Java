public class TamilProcessor implements Processor {
  
  Processor nextprocessor;
  
  public void read(String book) {
	if(book.equalsIgnoreCase("Tamil")) {
		System.out.println("reading tamil book");
	} 
	if(nextprocessor !=null) {
		nextprocessor.read(book);
	}
  }
  
  public void addProcessor(Processor nextprocessor) {
	  this.nextprocessor = nextprocessor;
  }
}