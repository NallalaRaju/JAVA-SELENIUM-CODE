package com.Arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{100,200},{300,400},{500,600}};
		//Printing the  specific value  from an array
		
		System.out.println(a[0][1]);
		
		//Printing all the values from an  array
		System.out.println(a[0].length);
		System.out.println();
		for(int row=0;row<a.length;row++)
			{
			for(int column=0;column<a[row].length;column++)
			{
				System.out.println(a[row][column]);
			}
			//Reading   data  using   enhanced for   loop
			for(int x[]:a)
			{
				for(int v:x)
				{
					System.out.println(v+"  skjfbsbkdjfskjh  "
							);
				}
			}
				
			
			
		}
		
		

	}

}
