package com.PracticeJava;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Number=123,rev=0,rem;
int temp=Number;
while(Number>0)
{
	rem=Number%10;
	Number=Number/10;
rev=rev*10+rem;
	
}
System.out.println(rev);
if(temp==rev)
{
	System.out.println(temp+" Given no is palindrome");
}
else
{
	System.out.println(temp+" Given no is not a palindrome ");
}
	}

}
