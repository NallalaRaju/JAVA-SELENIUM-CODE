package com.Constructors;

public class constructors {
int x,y,z;
String s;
String CompName;
String compLoc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructors ob1=new constructors();
		ob1.display();
		ob1.display1();


	}
	constructors()// constructor with no parameters
	{
		x=100;
		y=123;
		z=111;
		s="Raju ";
		CompName=" TCS ";
		compLoc=" KARIMNAGAR ";
		
	}
	//public constructors()
	{
	}
	void display()
	{
		System.out.println(x+" "+y+" "+z+"  ");
	}
	void display1()
	{
		System.out.println(CompName+" "+compLoc);
	}

}
