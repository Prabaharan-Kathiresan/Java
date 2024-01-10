public class InfoSystems {
		private String name = "InfoSystems";
		private String proprietor = "Palaniyappan";
		private String address = "Thanjavur";	

		//public InfoSystems(){
			//Super();
		//}
		
		private InfoSystems() { 	
		}
		
		
		
		public void display() {
			System.out.println("name ="+name);
			System.out.println("proprietor ="+proprietor);
			System.out.println("address ="+address);
		}
		
		
		private static InfoSystems infosystems = new InfoSystems();
		
		public static InfoSystems getInstance() {
			return infosystems;
		}
		
}


