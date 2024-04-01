package com.Operators;

public class operatorsPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programme  for  comparision  operators
		int  a=100, b=100;
		boolean c=(a==b);
		System.out.println(c);
		//Example for Comparision operators2
		if(a>b)
		{
			System.out.println();
		}

		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);

		System.out.println(a!=b);
		//Example for Relational operators
		
		System.out.println(a&b);// AND Operator
		System.out.println(a|b); //OR Operator
		
		//Example for Increment/decrement operators
int a1=++a;
int a2=b++;
int a3=--b;
int a4=b--;
System.out.println(a1+" pre increment "+a2+" Post increment "+a3+" predecrement "+a4+" post decrement ");

if(a1>a2)
{
	System.out.println(a1+" a1 is greater ");
}
else
	System.out.println(a1+" a1 is not greatest     ");



	}

}
