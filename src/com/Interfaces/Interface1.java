package com.Interfaces;
interface A
{int a1=10;
	void show();
}
interface B
{ int b1=21;
	void display();
}

public class Interface1 implements A
{
	public void show()
	{
		System.out.println(a1);
	}
/*public void display()
{
	System.out.println(b1);
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 obj1=new Interface1();
		//-;;;;;;;;obj1.display();
		obj1.show();
		
	}

}
