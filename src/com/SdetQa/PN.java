package com.SdetQa;

public class PN {

	public static void main(String[] args) {
int num=6,Count=0;
for(int i=1;i<=num;i++)
{
	if(num%i==0)
	{
		Count++;
	}
}
if(Count==2)
{
	System.out.println(" given no is   PN "+num);
}
else
{
	System.out.println(" given no is NOT A  PN "+num);

}
	}

}
