package com.InheritanceConcept;

public class SingleInheritance {
public static void main(String args[])
{
	C obj=new C();
	obj.a=120;
	//System.out.println(	obj.a=120);
	obj.b=217;
	obj.c=2212;
	obj.show();
	obj.display();
	obj.Visible();
	
}

}
//Single inheritance
class A
{
	int a=100;
	void show()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=200;
	void display()
	{
		System.out.println(b+"  "+a+"  the value of b is ");
	}
}

// Multiple Inheritances
class C extends B
{
	int c=221;
	void Visible()
	{
		System.out.println(c+" the value of c is ");
	}
	
	
}
