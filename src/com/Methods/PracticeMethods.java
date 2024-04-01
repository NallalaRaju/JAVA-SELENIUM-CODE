package com.Methods;

public class PracticeMethods {
	//Sample example programme to create a user defined methods assigning values during object creation
	int empid;
	int empsal;
	String empName;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMethods object= new PracticeMethods(3216,8000,"raju");
		
		object.empid=4009;
		object.empsal=45000;
		object.empName="Raju";
		object.empid=400123;

		
		//object.display();
		
		
	}
	public void display()
	{
		System.out.println(empid+" The employeee id of an empoloyee number ");
		System.out.println(empsal+" The employeee salary of an empoloyee ");
		
		System.out.println(empName+" The name of an empoloyee ");

	}
	PracticeMethods(int eid,int sal,String ename)
	{
		int empid;
		int empsal;
		String empName;
		
	}
	
	

}
