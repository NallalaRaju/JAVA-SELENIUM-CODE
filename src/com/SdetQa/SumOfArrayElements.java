package com.SdetQa;

public class SumOfArrayElements {

	public static void main(String[] args) {
		{
			int  a[]= {100,100,100,100
					};
			int sum=0;
			/*for(int i=0;i<a.length;i++)
			{
				
				sum=sum+a[i];
				
			}*/
			
			for(int i:a)
			{
				sum=sum+i;

			
		}
		System.out.println(sum);	
		float average=sum/a.length;
		System.out.println(average);
		}
	}

}
