package com.ConditionalStatements;

public class ifCondItion {
	static int age=18;
	static int num1=25;
	static int num2=55;
	public static void main(String args[])
	{	int Num1=22;

		//If condirion example1
		if(age>18)
		{
			System.out.println(" Yes eligible to vote ");
		}
		else 
		{
			System.out.println(" No he won't elible to vote ");
		}
	
	if(num1>num2)
	{
		System.out.println(num1+" num1 is greatest");
	}
	else
	{
		System.out.println(num2+" num2 is greatest");
	}
	
	if(Num1%2==0)
	{
		System.out.println(Num1+" Num1 is an even number ");
	}
	else
	{
		System.out.println(Num1+" Num1 is not an even number");
	}
	int Age=22;
	if(Age>=22 && Age<=34)
	{
		System.out.println(Age+" Candidate is eligible for IAS ");
	}
	else
	{
		System.out.println(Age+" Candidate is not eligible for IAS");
	}
	
	
	// sample programme to check whether 55 is divisible in 3 or 11
	int Num2=55;
	if(Num2%3==0 && Num2%11==0)
	{
		System.out.println(Num2+" Num2 is divible by 3 or 11 ");
	}
	else
	{
		System.out.println(Num2+" Num2 is not divisible by 3 or 11");
	}
		
	
	//Sample programme to check whether a number is positive or negative or zero
	int num3=5;
	if(num3>0)
	{System.out.println(num3+" num3 is positive ");
		
	}
	else if(num3==0)
	{
		System.out.println(num3+" num3 is zero ");
	}
	else
	{
		System.out.println(num3+" num3  is negative");
	}
	//Sample programme to check num is even and between 11 and 22 print Tom, num is odd and between 11 and 22 print jerry else print tom and jerry
	int num4=11;
	if(num4%2==0  && num4>=11 && num4<=22)
	{
		System.out.println(" Tom");
	}
	else if(num4%2!=0 && num4>=11 && num4<=22)
	{
	System.out.println(" Jerry ");	
	
	}
	else
	{
		System.out.println(" Tom && Jerry");
	}
	}	
	
	
}
	
