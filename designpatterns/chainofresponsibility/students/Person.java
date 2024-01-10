public class Person {
	public static void main(String args[]) {
		String book = "maths";
		TamilProcessor tamil = new TamilProcessor();
		EnglishProcessor english = new EnglishProcessor();
		MathsProcessor maths = new MathsProcessor();
		maths.addProcessor(english);
		tamil.addProcessor(maths);
		//tamil.addProcessor(new MathsProcessor());
		
				
		//EnglishProcessor english = new EnglishProcessor();
		//MathsProcessor maths = new MathsProcessor();
		//tamil.read(book);
		//english.read(book);
		//maths.read(book);
		tamil.read(book);
	}
}