package com.loops;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7, count=0;
		for(int i=1;i<=7;i++)
		{
			if(num%i==0)
			
				count++;
		}
		if(count==2)
		{
			System.out.println(num+" Number is palindrome");
		}
		else
		{
			System.out.println(num+" Number is not paalindrome");
		}
		
			
		}

	
}
