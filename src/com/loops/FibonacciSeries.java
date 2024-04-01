package com.loops;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  f1=0,f2=1;
		System.out.println(f1+" "+f2);
		for(int i=1;i<=15;i++)
		{int f3=f1+f2;
		if(f3%2==0)
		{
			System.out.println(f3 );
			f1=f2;
			f2=f3;
		}}

	}

}
