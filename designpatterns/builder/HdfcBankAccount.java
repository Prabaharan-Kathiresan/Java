public class HdfcBankAccount {
  private String name;
  private String age;
  private String fatherName;
  private String dob;
  private String address;
  private String email;
  private String adhar;
  private String mobile;
  private boolean mobileBanking;
  private boolean netbanking;
  

  public HdfcBankAccount(String name, String adhar) {
	 this.name = name;
	 this.adhar = adhar;
  }
 
  public HdfcBankAccount(String name, String fatherName, String dob, String address, String email, 
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

  public static class HdfcBankAccountBuilder {
    HdfcBankAccount hdfcAccount;
    public HdfcBankAccountBuilder(String name, String adhar) {
        hdfcAccount = new HdfcBankAccount(name, adhar);
    } 

    public HdfcBankAccountBuilder age(String age) {
        hdfcAccount.age = age;
        return this;
    }

    public HdfcBankAccountBuilder fatherName(String fatherName) {
        hdfcAccount.fatherName = fatherName;
        return this;
    }

    public HdfcBankAccountBuilder dob(String dob) {
        hdfcAccount.dob = dob;
        return this;
    }

    public HdfcBankAccountBuilder address(String address) {
        hdfcAccount.address = address;
        return this;
    }

    public HdfcBankAccountBuilder email(String email) {
        hdfcAccount.email = email;
        return this;
    }

    public HdfcBankAccountBuilder mobile(String mobile) {
        hdfcAccount.mobile = mobile;
        return this;
    }

    public HdfcBankAccountBuilder mobileBanking(boolean mobileBanking) {
        hdfcAccount.mobileBanking = mobileBanking;
        return this;
    }

    public HdfcBankAccountBuilder netbanking(boolean netbanking) {
        hdfcAccount.netbanking = netbanking;
        return this;
    }

    public HdfcBankAccount build() {
        return this.hdfcAccount;
    }



  }

  
}