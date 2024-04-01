package com.InheritanceConcept;

public class MulInherit {

	public static void main(String[] args) {
		
		Cc obj=new Cc();
		obj.ma();
		obj.mb();
		obj.mc();
	}

}
class Aa
{
	void ma()
	{
		System.out.println(" Hello");
	}
}
class Bb extends Aa
{
	void mb()
	{
		System.out.println(" Java ");
	}
}
class Cc extends Bb
{
	void mc()
	{
		System.out.println(" Python");
	}
}