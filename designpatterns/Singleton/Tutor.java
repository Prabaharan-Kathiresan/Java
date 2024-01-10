class Tutor  {
    private String name = "T1";
   
    public void show() {
		System.out.println("**************************");
		//InfoSystems info = new InfoSystems(); //object creation
		InfoSystems info = InfoSystems.getInstance();
		info.display();
		System.out.println("Tutor name = "+name);   
		System.out.println("**************************");
   }  
}