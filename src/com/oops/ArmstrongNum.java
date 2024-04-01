package com.oops;

public class ArmstrongNum {
	public static void main(String args[])
	{int num=153,temp=num,rem,arm=0;
		

while(num>0)
{
	rem=num%10;
	num=num/10;
	arm=arm+rem*rem*rem;
	
}
System.out.println(arm);
if(temp==arm)
{
System.out.println(temp+" it is  a palindrome");

}
else
{
	System.out.println(temp+"  it is not a palindrome");
}
	
}}
