package com.Methods;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Company details
		EmployeeData obj=new EmployeeData();
		obj.EmpJob=" Clerk ";
		obj.CompName=" Ola ";
		obj.CompanyTurnOver=500000;
		obj.DisplayCompData();
		PracticeMethods obj2=new PracticeMethods();
		obj2.empid=4444;
		obj2.empsal=50000;
		obj2.display();
		
	}
		
		String EmpJob;
		String CompName;
		int CompanyTurnOver;
		void DisplayCompData()
		{
			System.out.println(EmpJob+" Employee job ");
			System.out.println(CompName+" Name of the company  ");
			System.out.println(CompanyTurnOver+" Company turn over ");
			}
		

}
