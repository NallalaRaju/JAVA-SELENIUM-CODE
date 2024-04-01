package com.Strings;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1="LiveTech";
		String S2="LiveT";
		String S3="Training Institute";
		String S4="Ameerpet";
		//String Methods
		
		boolean Res=S1.equals(S3);
	boolean	Res1=S1.equalsIgnoreCase(S2);
	boolean Res2=S1.contains(S2);
	System.out.println(Res+"\n"+Res1+"\n   "+Res2+" \n "+S1.concat(S3)+"\n"+S1.concat(S2).charAt(3));
	String Ss=" Welcome  to selenium tr ";
	System.out.println(S2.replace('L','V'));
	System.out.println(S2.replaceAll(S4, Ss));
	//Case 2
	String s1="                  Welcome     ";
	String s2="To India";
	System.out.println(s1.contains(s2));
	System.out.println(s1.contentEquals(s2));
	System.out.println(s1.trim());
	String a[]=s1.split("l");
	System.out.println(a[1]+"    "+a[0]);
	//System.out.println()
	

//Differences  between equals method and ==
	//Case3
	String s11=new String("WelcoME");
	String s12=new String("WelcoME");
	
System.out.println(s11.equals(s12));  //Equals  Method will compare the value of object
System.out.println(s11==s12);// where as == method will compare  the objects


	
	

	}

}
