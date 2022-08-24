package org.oops;

public class Temp {   //Constructor chaining

	Temp()
	{
		this(5);
		System.out.println("the default constructor");
	}
	
	Temp(int x)
	{
		this(5,10);
		System.out.println("the parameterized constructor with x");
	}
	
	
	Temp(int x,int y)
	{
		System.out.println("the parameterized constructor with x and y");
	}
	
	public static void main(String args[])
	{
		new Temp();
		
	}
	
}
