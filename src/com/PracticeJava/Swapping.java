package com.PracticeJava;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Swapping of two numbers with using 3rd variable
		
/*		
int a=10,b=20,c;
System.out.println(a+" "+b+" before swapping");
c=a+b;
a=c-a;
b=c-a;
System.out.println(a+" "+b+" After swapping");
*/
		
		
		// Swapping of two numbers with out using 3rd variable
		int a=10,b=20;
		System.out.println(a+" "+b+" before swapping");
		b=b-a;

a=a+b;
System.out.println(a+" "+b+" After swapping");

	
	}

}
