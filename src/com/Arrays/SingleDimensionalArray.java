package com.Arrays;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach 1
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//Approach 2
		int  a[]= {100,200,300,400,500,600};
		int sum=0;
		System.out.println(a.length+"  The length of an array");//length method in array will provide  the  length of an array
System.out.println(a[3]);
System.out.println(Arrays.toString(a));
/*for(int i=0;i<=a.length-1;i++)
{
	System.out.println(a[i]);
}*/
for(int values:a)
{
	System.out.println(values+" printing the values using enhanced for loops ");
	//sum=sum+values;
	//System.out.println(sum);

}
//System.out.println(sum);
	}

}
