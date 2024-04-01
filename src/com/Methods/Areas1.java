package com.Methods;

public class Areas1 {
	public static void Hello()
	{
		System.out.println("Hello World Java");
	}
	public static void main(String args[])
	{
		//Areas1 object=new Areas1();
		Hello();
		MethodWithArguments object=new MethodWithArguments();
		object.AreaOfRectangle(10, 3);
		object.AreaOfCircle(5);
		
	}

}
