package com.SdetQa;

public class Rss {

	public static void main(String[] args) {
String  Str="Welcome";
String Rev="";
int len=Str.length();
for(int i=len-1;i>=0;i-- )
{
	Rev=Rev+Str.charAt(i);
}
System.out.println(Rev);
	}

}
