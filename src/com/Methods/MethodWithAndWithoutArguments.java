package com.Methods;

public class MethodWithAndWithoutArguments {
public void Add(int a,int b)
{
	int c=a+b;
	System.out.println(c+"  The sum of two nos  ");
}
public void sub()
{
	int a=10,b=20;
	int c=b-a;
	System.out.println(c+" the subtraction of two nos");
}
public static void main(String args[])
{ MethodWithAndWithoutArguments object1=new MethodWithAndWithoutArguments();
object1.Add(5, 6);
object1.sub();
	
	
}
}
