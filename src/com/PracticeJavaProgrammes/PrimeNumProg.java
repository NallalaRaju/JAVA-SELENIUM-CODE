package com.PracticeJavaProgrammes;

public class PrimeNumProg {

	public static void main(String[] args) {
int num=6;
int count=0;
for(int i=1;i<=num;i++)
{
	if(num%i==0)
		count++;
}
if(count==2)
{
	System.out.println(num+" given num is a prime number");
}
else
{
	System.out.println(num+" given num is not a prime numeber");
}
	}

}
