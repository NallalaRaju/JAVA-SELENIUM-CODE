package com.MultipleMethods;

public class Employee {
	int Empid,salary,deptno;
	
	String Ename;
	Employee(int id,int sal,int dept,String empName)
	{Empid=id;
	salary=sal;
	deptno=dept;
	Ename=empName;
	}
	void display()
	{
	System.out.println(Empid+" \n "+salary);
	
	
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee object1=new Employee(101,40000,432," Rrr ");
		object1.display();
	}

}

