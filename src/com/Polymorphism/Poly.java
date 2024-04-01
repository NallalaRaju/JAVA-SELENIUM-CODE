package com.Polymorphism;

public class Poly {
	int x,y,z;
	double b;
	void sum()
	{
		x=10;
		y=20;
		z=x+y;
		System.out.println(z+"  the sum of rwo numers x and y ");
		
	}
	void sum(int a,int b)
	{
		x=a;
		y=b;
		z=x+y;
		System.out.println(z+"  the sum of rwo numers x and y ");

		
	}
	void sum( double b, int a)
	{
		
	}
	void sum(int a, double b)
	{
		x=a;
		double y=b;
		double z=x+y;
		System.out.println(z+" the sum  of  two numbers x and y ");
	}
	/*void sum(double b,int a)
	{
		double x=b;
		y=a;
		double z=x+y;
		System.out.println(z+" the sum of two numbers x and y in 3rd method ");
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly o=new Poly();
		o.sum();
		o.sum(10, 15);
		o.sum(16, 8);
		o.sum(15, 25);

	}

}
