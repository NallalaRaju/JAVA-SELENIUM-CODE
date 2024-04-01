package com.SdetQa;

public class Palindrome {

	public static void main(String[] args) {
		int num=5,rev=0,rem;
		int temp=num;
		while(num>0)
		/*{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}*/
			{
			rem=num%10;
			num=num/10;
			rev=rev+rem*rem*rem;
		}
			
			System.out.println(rev);
	}

}
