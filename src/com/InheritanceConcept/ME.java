package com.InheritanceConcept;

public class ME implements MultipleInheritance,MultipleInheritance2,MultipleInheritance3
{
public void M1()
{
	System.out.println(" Hello ");
}
public void M2()
{
	System.out.println(" Java ");
}
public void M3()
{
	System.out.println(" Python ");
}
	public static void main(String[] args) {
		ME obj=new ME();
		obj.M3();
	}
	

}
