package com.Methods;

public class Areas extends Areas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areas obj=new Areas();
		//obj.AreaOfSquare();
		AreaOfRectangle();
		AreaOfCircle();
		obj.Hello();
		
		
	}
	public static void AreaOfRectangle()
	{
		int  l=10;
		int b=2;
		int c=l*b;
		System.out.println(c+"Area of Rectangle is called and executed");
	}
	public static void AreaOfCircle()
	{
		int r=10;
		int Area=r*r;
		System.out.println(Area+"Area of Circle method is called and executed");
	}
	public void AreaOfSquare()
	{
		int s=10;
		int AreaOfS=s+s;
		System.out.println(AreaOfS+"Area of Square method is called nd Executed");
	}

}
