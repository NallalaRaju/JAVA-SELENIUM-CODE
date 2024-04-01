package com.SdetQa;

public class fibonac {

	public static void main(String[] args) {

		int f1=0,f2=1;
		int F3;
		for(int i=1;i<=10;i++)
		{
			F3=f1+f2;
			System.out.println(F3+" The fibonacci series values are  ");
		  f1=f2;
		  f2=F3;
		  
		  
		
		}
		
	}

}
