package com.loops;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f1=0,f2=1,f3;
for(int i=1;i<=15;i++)
{
	f3=f1+f2; //f3=1,2,
	
	if(f3%2==0)
	{
		System.out.println(f3);
	}
	f1=f2;
	f2=f3;
	
}
	}

}
