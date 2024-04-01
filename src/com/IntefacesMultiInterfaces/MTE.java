package com.IntefacesMultiInterfaces;

class MTE implements A1,A2,A3
	{
		public void m112()
		{
			System.out.println(" 1st method");
		}
		public void m1112()
		{
			System.out.println(" 2nd method");

		}

		public void m11113()
		{
			System.out.println(" 3rd method");

			
		}
		public static void main(String args[])
		{
			MTE obj=new MTE();
			obj.m11113();
			obj.m112();
			obj.m1112();
		
		}

		
	}
	
	
	
	


