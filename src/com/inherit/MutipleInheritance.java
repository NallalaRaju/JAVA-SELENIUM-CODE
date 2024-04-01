package com.inherit;

public class MutipleInheritance {
	int a=111;
	public static void main(String args[])
	{
		XYZ obj=new XYZ();
		obj.m1();
	}
	
}
class ABC
{int a=131826;
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
	
}

class XYZ extends ABC
{int a=1234;
	void m1()
	{
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(this.a);

		

	}
	void m2(int a,int b)  // Overloading
	{
		System.out.println("  skfgbsdkjfkjj ");
	}
	
}
