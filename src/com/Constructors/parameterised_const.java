package com.Constructors;

public class parameterised_const {
int empId,empDept;
String CompName,CompLoc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterised_con
		
		st c11=new parameterised_const();
		c11.display();
		parameterised_const c12=new parameterised_const(4009, 11, "raj","KRMR");
		System.out.println(c12.empId+" "+c12.empDept+"\n"+c12.CompName+"\n"+c12.CompLoc);

		
		

	}
	parameterised_const()
	{
		empId=4009;
		empDept=12;
		
	}
	parameterised_const(int eid,int edept,String Cname,String Cloc)
	{
		empId=eid;
		empDept=edept;
		CompName=Cname;
		CompLoc=Cloc;
		
	}
	
	void display()
	{
		System.out.println(empId+" empId of an employee "+empDept+" employee department   ");
	}
	
}
