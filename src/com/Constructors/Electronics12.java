
package com.Constructors;

public class Electronics12 {
// sample programme for Electronics11
	String name, brand, color;
	int price, size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronics12 obj=new Electronics12("Cooker","panasonic","White",4000,5);
		obj.Electronics_information();
		

	}
	Electronics12(String pname,String pbrand, String pcolor, int pprice, int psize)
	{
		name=pname;
		brand=pbrand;
		color=pcolor;
		price=pprice;
		size=psize;
		
	}
	void Electronics_information()
	{
		System.out.println(name+" product name "+brand+" the brand of a product"+color+" color of a product "+price+" the price of that product "+size+" size of that product ");
	}
	

}
