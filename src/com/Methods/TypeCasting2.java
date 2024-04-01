package com.Methods;

public class TypeCasting2 {
	
	//TypeCasting--->converting one datatype value into another datatype--TypeCasting is of two types 1.widening, 2.narrowing
		//this is an example for widening--converting smaller data type value into larger-->byte-->short-->int-->Long-->Float-->double
		public static void main(String[] args)
		{
		//System.out.println(b+" byte "+s+" short "+i+" int "+L+" Long "+f+" float "+d+" double ");
		//System.out.println(type(d));
			int i=1231;
			short s=(short)i;
			long L=(long)s;
			float f=(float)L;
			System.out.println(f+"  "+i);
		
		}
	

}
