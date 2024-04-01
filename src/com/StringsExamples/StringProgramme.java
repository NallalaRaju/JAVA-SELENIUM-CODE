package com.StringsExamples;

public class StringProgramme {

	public static void main(String[] args) {
String S1="Livetech";
String S2="LivetecH";
if(S1.equalsIgnoreCase(S2))
{
	System.out.println("Pass");
}
else
{
	System.out.println("False");
}

System.out.println(S1.concat(S2));
System.out.println(S1.lastIndexOf(S2, 0));
System.out.println(S1.substring(2, 1));

	}

}
