package com.SdetQa;

public class Factorial {

	public static void main(String[] args) {

		int Factorial=1,Num=5;
		for(int i=Num;i>=1;i--)
		{
			Factorial=Factorial*i;
		}
		System.out.println(Factorial);
	}

}
