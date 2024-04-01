package com.Methods;

public class MethodWithArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithArgument object=new  MethodWithArgument();
		object.Voter_Registration("Raju", 27, 876352555);
		object.Voter_Registration("ahgf", 754, 8352632);

	}
	public void Voter_Registration(String name,int age, long aadhar)
	{
		String ename=name;
		int eage=age;
		long Eaadhar=aadhar;
		System.out.println(ename+" employee name "+eage+" Employee age "+Eaadhar+" Employee aadhar ");
	
	}

}
