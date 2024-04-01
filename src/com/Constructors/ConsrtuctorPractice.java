package com.Constructors;

public class ConsrtuctorPractice {
	String dname;
	int i;
	
	public ConsrtuctorPractice()
	{
		dname="dog";
		System.out.println("Constructor with no parameters");
	}
	public ConsrtuctorPractice(int a)
	{
		float i=a;
		System.out.println("Constructor with parameters");
	}
public static void main(String[] args)
{
	ConsrtuctorPractice obj=new ConsrtuctorPractice();
	ConsrtuctorPractice obj1=new ConsrtuctorPractice(17);
	System.out.println(obj.dname);
	System.out.println(obj1.i);


	
}}