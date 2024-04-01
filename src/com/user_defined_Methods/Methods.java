package com.user_defined_Methods;

public class Methods {
	// Programme to print Area of rectangle, area of circle using user defined methods
int r;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods object=new Methods();
		object.AreaOfCircle();
		object.AreaOfRectangle();

	}
	
	public void AreaOfCircle()
	{
		
		float pie=3.17f;
		float Area=r*r*pie;
		System.out.println(Area+" The area of circle ");
		
	}
	public void AreaOfRectangle()
	{
		int l=14,b=16;
		int AreaOfRectangle=l*b;
		System.out.println(AreaOfRectangle+" Area of rectangle is : ");
	}

	
}
