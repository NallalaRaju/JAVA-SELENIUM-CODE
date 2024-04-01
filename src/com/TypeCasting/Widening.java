package com.TypeCasting;

public class Widening {
	static char g;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte a=127;
short b=a;
int c=b;
long d=c;
float e=d;
double f=e;

System.out.println(a+" the value of a is in byte  :\n"+b+" the value of b in short is \n "+c+" the value of c in int  is : "+d+" the vaue of d in long  is"+e+" the value of e in float is :\n"+f+" the value of f in double is :\n  "+g+" the value of g is in char ");
Widening obj=new Widening();
obj.Add();
	}
	public void Add()
	{
		long a=54678;
		byte bytetype=(byte)a;
		float f=10123.3444555f;
		double d=347.74322111;
		short shortType=(short)f;
		int integer=(int)d;
		System.out.println(bytetype+" byte type "+shortType+" shortType"+integer+" integer");
	}
	

}
