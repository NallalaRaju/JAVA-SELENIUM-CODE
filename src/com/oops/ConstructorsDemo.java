package com.oops;

public class ConstructorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=121, rem,rev=0;
int temp=num;
while(num>0)
{
	rem=num%10;
	num=num/10;
	rev=rev*10+rem;
}
if(temp==rev)
{
System.out.println(temp+" the reverese of a given no is ");
	}
else
{
	System.out.println(temp+" not a palindrome");
}}

}
