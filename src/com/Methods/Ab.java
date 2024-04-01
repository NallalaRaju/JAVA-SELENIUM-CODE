package com.Methods;

public class Ab {
	void m1 ()
	{
		System.out.println(" Hello ");
	}
public static void main(String args[])
{
	Ac obj=new Ac();
	obj.m1();
}
}
class Ac extends Ab
{
	void m1()
	{
		System.out.println(" Bolo ");
	}
}

