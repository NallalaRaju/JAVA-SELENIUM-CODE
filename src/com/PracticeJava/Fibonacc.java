package com.PracticeJava;

public class Fibonacc {

	public static void main(String[] args) {

		
		int f1=0,f2=1,f3;
		System.out.println(f1+""+f2);
		for(int i=1;i<=5;i++)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			
		}
	}

}
