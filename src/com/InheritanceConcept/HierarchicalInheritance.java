package com.InheritanceConcept;

public class HierarchicalInheritance {
	public static void main(String args[])
	{
		D1 obj=new D1();
		obj.d22();
		A1 obj1=new A1();
		obj1.a11(8);
	}

}

//HierarchicalInheritance
class A1 
{
	int a1=10;
	int a2=31;
	void a11(int a)
	{
		System.out.println(a+"  the value of a1 is ");
	}
	void a22()
	{
		System.out.println(a2+"  the value of a2 is ");
	}
	

}
class B1 extends A1
{
	int b1=100;
	int b2=22;
	void b11()
	{
		System.out.println(b1+" the value of b1 is ");
	}
	void b22()
	{
		System.out.println(b2+" the value of b22 is ");
	}
}
class C1 extends A1
{
	int c1=107;
	int c2=1212;
	void c11()
	{
		System.out.println(c1+" the value of c1 is ");
	}
	void c22()
	{
		System.out.println(c2+" the value of c2 is ");
	}
}
class D1 extends A1
{
	int d1=11;
	int d221=1223;
	void d11()
	{
		System.out.println(d1+" the value of d1 is ");
	}
	void d22()
	{
		System.out.println(d221+" the value of d221 is ");
	}
}
