package com.PracticeJava;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Number=153,rem,arm=0
;
int temp=Number;
while(Number>0)
{
	rem=Number%10;
	Number=Number/10;
	arm=arm+rem*rem*rem;
}
System.out.println(arm);
if(temp==arm)
{System.out.println(temp+" Given no is armstrong");
	}
else
{
	System.out.println(temp+" Given no is not an armstrong ");
}

}}
