package com.Encapsulation;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account object1=new Account();
		object1.setAcc_Holder_Name(" Nallala Raju ");
		object1.setAcc_Num(765432189);
		object1.setBank_Name("Union Bank Of India");
		object1.setIfsc_Code("UBIN0807761");
		object1.setAcc_Available_Balance(30.09400000);
	String Name=object1.getAcc_Holder_Name();
		double AccName=object1.getAcc_Num();
		String BankName=object1.getBank_Name();
		String Ifsc=object1.getIfsc_Code();
		double AvailableBalance=object1.getAcc_Available_Balance();
		System.out.println(AccName+" \n"+BankName+" \n "+Ifsc+"\n "+AvailableBalance+"\n"+Name);
		
	}

}
