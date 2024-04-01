package com.Interface;

public interface InterfaceExample {
int a=10;
void m1();
void m2();
public static void main(String args[])
{
	
}

public class methods implements InterfaceExample
{
	public void m1()
{
	System.out.println("Sum method");
}
public void m2()
{
	System.out.println(" sub method ");
}
public static void main(String args[])
{
	methods objec=new methods();
	objec.m1();
	objec.m2();
	
}

}
}