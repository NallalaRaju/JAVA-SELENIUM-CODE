package com.loops;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sample programme to print values from 45 to 25 using while loop
		/*int i=45;
		while(i>=25)
		{
			System.out.println(i);
			i--;
		}*/
		int num=123,rem,rev=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		

	}

}
