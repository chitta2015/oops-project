package org.oops;

public class StaticMethod {
	
	static void test()
	{
		System.out.println("This is a static method"); 
	}
	
	void nonStaticMethod()
	{
		System.out.println("This is a non static method"); 
	}
	

	public  static void main(String[] args) {
		
		test();  //calling static method
		StaticMethod ob=new StaticMethod();
		ob.nonStaticMethod();//calling non-static method
		
	}

}
