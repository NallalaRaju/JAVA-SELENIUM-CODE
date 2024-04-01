n
package com.PracticeJavaProgrammes;

public class ReverseOfAString {

	public static void main(String[] args) {
String Str="ABCDEFGH";
String Rev="";
int len=Str.length();
System.out.println(len);
for(int i=len-1;i>=0;i--)
{
	
	Rev=Rev+Str.charAt(i);
}
System.out.println(Rev);
	}

}
