package com.Polymorphism;

public class Const {
int x,y,z;
Const(int x,int y)// 1st constructor
{
	x=x;
	this.y=y;
	z=x+y;
	System.out.println(z+" the value of z is    dfgskj ");
}
Const() // 2nd constructor 
{
	x=10;
	y=20;
	z=x+y;
	System.out.println(z+" the value of z is: ");
}
Const(int a1,int b1,int c1) // 3rd constructor
{
	x=a1;
	y=b1;
	z=c1;
	int z123=x+y+z;
	System.out.println(z123);
	
}
void Display()
{
	System.out.println(x+" the value of x in 1st constructor");
}
void SetData()
{
	System.out.println(x+"  "+y+"  "+z);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const ob12=new Const();
		
		Const ob13=new Const(10,21,31);
		Const ob14=new Const(21,55);


		
	}

}
