package com.PracticeJava;

public class PrimeNumber {

	public static void main(String[] args) {

		int num=8;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
		{
			System.out.println(num+" given no is pn");
		}
		else
		{
			System.out.println(num+" given no is non pn");
		}
	}

}
