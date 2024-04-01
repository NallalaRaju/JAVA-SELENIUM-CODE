package com.HyrTutorials;

public class Swaraj implements Tractor{
	public static void main(String args[])
	{
		Swaraj object=new Swaraj();
		object.plough();
		object.PullTrolley();
		object.Rotavator();
		object.Blade();
		
		
		System.out.println();
	}

	public void plough() {
		System.out.println(" Swaraj Tractor Plough code");
		
	}

	public void PullTrolley() {
		System.out.println(" Swaraj Tractor pulling trolley power code");

		
	}

	public void Rotavator() {
		System.out.println(" Swaraj Tractor Rotavator  code");

		
	}

	public void Blade() {
		System.out.println(" Swaraj Tractor Blade code");

		
	}
	

}
