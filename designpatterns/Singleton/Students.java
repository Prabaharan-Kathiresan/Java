public class Students 
{
   private String name = "S1";
   
   public void show() {
		System.out.println("**************************");
		//InfoSystems info = new InfoSystems(); //object creation is the problem
		InfoSystems info = InfoSystems.getInstance(); //one instance is rfered here
		info.display();
		System.out.println("Student name = "+name);   
		System.out.println("**************************");
   }  
    
}




