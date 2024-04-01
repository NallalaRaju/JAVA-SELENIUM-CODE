package com.Methods;

public class TypeCasting {
	//TypeCasting--->converting one datatype value into another datatype--TypeCasting is of two types 1.widening, 2.narrowing
	//this is an example for widening--converting smaller data type value into larger-->byte-->short-->int-->Long-->Float-->double
	 static byte b=121;
	 static short s=b;
	 static int i=s;
	 static long L=i;
	 static float f=L;
	 static double d=f;
	public static void main(String[] args)
	{
	System.out.println(b+" byte "+s+" short "+i+" int "+L+" Long "+f+" float "+d+" double ");
	//System.out.println(type(d));
	
	}
}
