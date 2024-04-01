package com.PracticeJava;

public class SumOfIndividualNum {
	
	//Important programme for Interview

	public static void main(String[] args) {

		int num=1234;
		int sum=0,rem;
		while(num>0)
		{rem=num%10;   
		num=num/10; 
		sum=sum+rem;
		
			
		}
		System.out.println(sum);
	}

}
