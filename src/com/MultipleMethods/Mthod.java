package com.MultipleMethods;

public class Mthod {
	int a=117,b=122;
	void Sum()// method with no parameters
	{
		System.out.println(a+b+" hello ");
	}
	
	void sum(int a,int b)// Method with parameters
	{
		System.out.println(a+b+" hello 2 ");
	}
	int sum1()
	{
		return (a+b);
	}
	
	
	public static void main(String args[])
	{ Mthod obj1=new Mthod();
	/*obj1.a=100;
	obj1.b=200;*/
	obj1.Sum();
	obj1.sum(111,333);
	System.out.println(obj1.sum1());
	}
	

}
