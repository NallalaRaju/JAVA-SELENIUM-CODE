package com.Methods;

public class StaticAndNonstaticMembers {
	int a=10;
	static int b=15;
	public static void main(String[] args)
	{StaticAndNonstaticMembers object=new StaticAndNonstaticMembers();
	
		System.out.println(b+" "+object.a);
		//System.out.println(c );
		object.add();
	}
	public void add()
	{
		int c=b+a;
		System.out.println(c);
	}

}
