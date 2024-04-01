package com.PracticeJava;

public class ArmStrongNo {

	public static void main(String[] args) {
int num=154,rem,arm=0;
int temp=num;
while(num>0)
{
	rem=num%10;
	num=num/10;
	arm=arm+rem*rem*rem;
	
}
System.out.println(arm);
if(arm==temp)
{
	System.out.println(arm+" it is arm strong");
}
else
{
	System.out.println(arm+" it is not an armstrong");
}
	}

}
