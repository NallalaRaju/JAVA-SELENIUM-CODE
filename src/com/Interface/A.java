package com.Interface;

 interface A {
	void m1();
	void m2();
	}
interface B
{
	void m3();
	void m4();
}
interface C
{
	void m5();
	void m6();
}
class MultipleInheritance implements A,B,C
{
	public  void m1()
	{
		System.out.println(" M1 method");
	}
	public void m2()
	{
		System.out.println(" M2 method");

	}
	public void m3()
	{
		System.out.println(" M3 method");

	}
	public void m4()
	{
		System.out.println(" M4 method");

	}
	public void m5()
	{
		System.out.println(" M5 method");

	}
	public void m6()
	{
		System.out.println(" M6 method");

	}
public static void main(String args[])
{MultipleInheritance obj=new MultipleInheritance();
obj.m1();
obj.m2();
obj.m3();
obj.m4();
obj.m5();
obj.m6();
}

}


