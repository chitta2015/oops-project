package org.oops;

public class MethodTest {

	public int addition(int a,int b)
	{
		return a+b;
	}
	
	public void display()
	{
		int result=addition(10,20);
		System.out.println("Result= "+result);
	}
	
	public static void main(String[] args) {
		
		MethodTest ob=new MethodTest();
		ob.display();
		

	}

}
