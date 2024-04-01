package com.PracticeJavaProgrammes;

public class Palindrome {

	public static void main(String[] args) {
int num=1231,rev=0,rem;
int temp=num;
while(num>0)
{
	rem=num%10;
num=num/10;
rev=rev*10+rem;

	}
System.out.println(rev);
if(temp==rev)
{
	System.out.println(temp+" it is palindrome");
}
else
{
	System.out.println(temp+" it is not a palindrome");

}

}}
