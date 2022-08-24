package org.oops;

public class StaticBlock {

	static int a=10, b=4;
	
	static
	{
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args) {
	  System.out.println("This is the main method");

	}

}
