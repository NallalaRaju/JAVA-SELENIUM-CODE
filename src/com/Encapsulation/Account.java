package com.Encapsulation;

public class Account {
private int Acc_Num;
private String Acc_Holder_Name;
private double Acc_Available_Balance;
private String Ifsc_Code;
private String Bank_Name;
public int getAcc_Num() {
	return Acc_Num;
}
public void setAcc_Num(int acc_Num) {
	Acc_Num = acc_Num;
}
public String getAcc_Holder_Name() {
	return Acc_Holder_Name;
}
public void setAcc_Holder_Name(String acc_Holder_Name) {
	Acc_Holder_Name = acc_Holder_Name;
}
public double getAcc_Available_Balance() {
	return Acc_Available_Balance;
}
public void setAcc_Available_Balance(double acc_Available_Balance) {
	Acc_Available_Balance = acc_Available_Balance;
}
public String getIfsc_Code() {
	return Ifsc_Code;
}
public void setIfsc_Code(String ifsc_Code) {
	Ifsc_Code = ifsc_Code;
}
public String getBank_Name() {
	return Bank_Name;
}
public void setBank_Name(String bank_Name) {
	Bank_Name = bank_Name;
}


}
