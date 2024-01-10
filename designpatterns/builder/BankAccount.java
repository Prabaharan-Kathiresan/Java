public class BankAccount {
  private String name;
  private String fatherName;
  private String dob;
  private String address;
  private String email;
  private String adhar;
  private String mobile;
  private boolean mobileBanking;
  private boolean netbanking;
  

  public BankAccount(String name, String adhar) {
	 this.name = name;
	 this.adhar = adhar;
  }
 
  public BankAccount(String name, String fatherName, String dob, String address, String email, 
  String adhar, String mobile, boolean mobileBanking, boolean netBanking ) {
  
		this.name = name;
		this.fatherName = fatherName;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.adhar = adhar;
		this.mobile = mobile;
		this.mobileBanking = mobileBanking;
		this.netbanking = netbanking;
		
  }
  
  public void show() {
	  System.out.println("name::"+name) ;
	  System.out.println("fatherName::"+fatherName) ;
	  System.out.println("dob::"+dob) ;
	  System.out.println("address::"+address) ;
	  System.out.println("email::"+email) ;
	  System.out.println("adhar::"+adhar) ;
	  System.out.println("mobile::"+mobile) ;
	  System.out.println("mobileBanking::"+mobileBanking) ;
	  System.out.println("netbanking::"+netbanking) ;
 
  } 

  
}