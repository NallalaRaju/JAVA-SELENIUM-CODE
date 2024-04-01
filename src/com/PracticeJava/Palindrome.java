package com.PracticeJava;

public class Palindrome {

	public static void main(String[] args) {
int num=111

, rev=0,rem;
int temp=num;
while(num>0)
/*{
	rem=num%10;
	num=num/10;
	rev=rev*10+rem;
	
}*/
{

	// Armstrong code
	rem=num%10;
	num=num/10;
	rev=rev+rem*rem*rem;
}
System.out.println(rev);
if(temp==rev)
{
	System.out.println(temp+" Given no is palindrome");
}
else
{
	System.out.println(temp+" Given no is not a palindrome");
}
	}

}
