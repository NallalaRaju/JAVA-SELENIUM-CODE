package com.Constructors;

public class Electronics {
	String name,brand,colorsize;
	int price;
	Electronics(String pname,String brand,String pcolorsize, int Pprice)
	{name=pname;
	this.
	brand=brand;
	colorsize=pcolorsize;
	price=Pprice;
	}
	public void display()
	{
		System.out.println(name+"  "+brand+" "+colorsize+"  "+price+" ");
	}
	public static void main(String[] args)
	{
		Electronics object=new Electronics("Rice Cooker","Panasonic","White",2500);
		object.display();
		Electronics object1=new Electronics("Rice Cooker","ganga","White",2500);
		object1.display();
	}

}
