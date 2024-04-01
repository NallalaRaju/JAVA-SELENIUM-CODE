package com.MultipleMethods;

public class FinalKeyWord {
	final int a=177;
	final void m1()
	{
		System.out.println(a);
	}
	void m1(int a)
	{
		System.out.println(a+" the final keyword value ");
	}
	class FinalKeyword123 extends FinalKeyWord
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyWord object1=new FinalKeyWord();
		object1.m1();
		object1.m1(2);
		
	}

}
