package com.Constructors;

public class EmployeeApp {
//Practice for constructor example
	String EmpName, EmpDesg;
	int EmpSalary, EmpId;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeApp obj=new EmployeeApp("Raju"," Clerk ",43626,4009);	
		obj.Employee_Display();
		EmployeeApp obj1=new EmployeeApp("sss"," accountant ",4000,4004);	
		obj1.Employee_Display();


		
		
	}
		
	EmployeeApp(String EmpName,String Edesg,int Esal,int eid)
	{this.EmpName=EmpName;
	EmpDesg=Edesg;
	EmpSalary=Esal;
	EmpId=eid;
		
	}
	void Employee_Display()
	{
		System.out.println(EmpName+" "+EmpDesg+" "+EmpSalary+" "+EmpId+" ");
	}
	
	

}
