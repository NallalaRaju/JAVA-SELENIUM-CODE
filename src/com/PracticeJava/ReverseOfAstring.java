package com.PracticeJava;

public class ReverseOfAstring {

	public static void main(String[] args) {
// Important programme for interview 
		String s="ABCDEFGHIJKLMNO",Reverse="";
		 int  Len=s.length();
		 System.out.println(Len+" the length of a string ");
		 for(int i=Len-1;i>=0;i--)
		 {Reverse=Reverse+s.charAt(i);
		 //System.out.println();
		 
		 }
		 System.out.println(Reverse+" Reverse of a Given string is: ");

	}

}
