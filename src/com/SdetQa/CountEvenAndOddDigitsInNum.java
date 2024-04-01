package com.SdetQa;

public class CountEvenAndOddDigitsInNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123457;
int EvenCount=0,OddCount=0;
while(num>0)
{
	int rem=num%10;
	if(rem%2==0)
	{
		EvenCount++;
	}
	else
	{
		OddCount++;
	}
	num=num/10;
	
}
System.out.println(EvenCount+"  "+OddCount);
	}

}
