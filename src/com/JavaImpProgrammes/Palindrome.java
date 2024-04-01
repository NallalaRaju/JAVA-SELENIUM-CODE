package com.JavaImpProgrammes;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,rem,rev=0;
		int temp=num;
		
		
		//Sample code for palindrome number
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
if(temp==rev)
{
	System.out.println(temp+" it is  a palindrome ");
}
else {
	System.out.println(rev+" not a palindrome ");
	}}}
		
		
		// sample code for armstrong programme
		/*while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev+rem*rem*rem;
		}
		if(rev==temp)
		{
			System.out.println(rev+" given no is Armstrong");
		}
		else
		{System.out.println(rev+" given no is not an armstrong");
		
		}
		
		*/
		
		
		
	//}


