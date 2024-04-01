package com.JavaImpProgrammes;

public class ReverseOfANumber {
static int num=12314;
static int rem,rev=0, temp=num;
public static void main(String args[])
{
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		rev=rev*10+rem;
	}
	System.out.println(rev);
	
}
}
