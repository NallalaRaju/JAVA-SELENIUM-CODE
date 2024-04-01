package com.SdetQa;

public class ExceptionHandling {

	public static void main(String[] args) {
String str=null;
System.out.println(" Hello  Java  ");
try
{
	System.out.println(str.length());
}
catch(Exception e);
{
	System.out.println("Null pointer exception");
	
}
finally
{
	System.out.println(" Hello ");
}
	}

}
