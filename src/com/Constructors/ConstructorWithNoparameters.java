package com.Constructors;

public class ConstructorWithNoparameters {
	String dname;
	ConstructorWithNoparameters(String name)
	{dname=name;
	
		
	}
	public static void main(String[] args)
	{
		ConstructorWithNoparameters obj1=new ConstructorWithNoparameters("ggc");
		//ConstructorWithNoparameters obj2=new ConstructorWithNoparameters();
	
	System.out.println(obj1.dname);
	//System.out.println(obj2.dname);

	}

}
