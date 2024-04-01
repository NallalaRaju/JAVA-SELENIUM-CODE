package com.inheritance;

public class Parent {
	void display(int a)
	{
		System.out.println(a);
	}
	}

	class Child extends Parent
	{
		void Show()
		{
			System.out.println("Hello");
		}
	}
	class Child2 extends Parent
	{
		
	}
	
	class InheritanceTypes extends Child{
		public static void main(String[] args)
		{//Parent obbj=new Parent();
		//obbj.display(10);
		Child obbj1=new Child();
		obbj1.Show();
		obbj1.display(10);
			
		}
	
	}
