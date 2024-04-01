package com.PracticeJava;

public class ExceptionHanDling {

	public static void main(String[] args) {
String Str=null;
int a[]=new int[2];
System.out.println("Programme started ");
try
{
	//System.out.println(Str.length());
	System.out.println(a[0]);

}
catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println(e.getMessage());

}
finally
{
	System.out.println(" The programme keeps on  exceuting");
}
System.out.println("Programme Exited ");

	}

}
