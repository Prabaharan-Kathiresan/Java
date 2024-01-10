public class HdfcCustomer {
    public static void main(String args[]) {
        HdfcBankAccount hdfcAccount = new HdfcBankAccount.HdfcBankAccountBuilder("Praba","adhar")
        .age("30").fatherName("father").mobile("mobile").netbanking(true).build();
        hdfcAccount.show();
		
		HdfcBankAccount hdfcAccount1 = new HdfcBankAccount.HdfcBankAccountBuilder("Praba","adhar").build();        
        hdfcAccount1.show();
        
    }
}