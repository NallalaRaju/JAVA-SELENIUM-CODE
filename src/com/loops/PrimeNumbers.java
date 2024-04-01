package com.loops;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//programme to check all Prime  numbers from 2 to 15
		for(int  num=2;num<=15;num++)
		{
			int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}}
				if(count==2)
				{
					System.out.println(num+" these are the prime numbers ");
				}
			}
		}

	}


