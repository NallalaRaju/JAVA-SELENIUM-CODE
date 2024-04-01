package com.Constructors;

public class Employee {
	String empname;
	String empDesg;
	Employee(String ename,String edesg,int esal,int eid)
	{ empname=ename;
	empDesg=edesg;
	int empsal=esal;
	int empId=eid;
		
	}
	public static void main(String[] args)
	{Employee obj=new Employee("Raju","TraineeQA",12000,3573);
	System.out.println(obj.empname+obj.empDesg);
		
	}
	
}
