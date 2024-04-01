package com.PracticeJava;

public class PrimeNumeber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=6,count=0;
for(int i=1;i<=number;i++)
{
	if(number%i==0)
	{
		count++;
	}
}
if(count==2)
{
	System.out.println(number+" given number is a prime number ");
}
else
{
	System.out.println(number+" given number is not a prime number ");
}

	}

}
