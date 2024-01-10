public class EnglishProcessor implements Processor {
	
  Processor nextprocessor;
  
  public void read(String book) {
	if(book.equalsIgnoreCase("English")) {
		System.out.println("reading english book");
	} 
	if(nextprocessor !=null) {
		nextprocessor.read(book);
	}
  }
  
    public void addProcessor(Processor nextprocessor) {
	  this.nextprocessor = nextprocessor;
  }
}