package org.oops;

import org.oops.OuterClass.NestedStaticClass;

//Outer class
class OuterClass
{
	private static String msg="EduBridge";
	
	//Nested static class
	public static class NestedStaticClass
	{
		public void test()
		{
			System.out.println("This is NestedStaticClass test method..");
		}
				
	}
	
	public  class NestedNonStaticClass
	{
		public void test()
		{
			System.out.println("This is NestedNonStaticClass test method..");
		}
				
	}
		
}



public class StaticMain {

	public static void main(String[] args) {
		
		OuterClass.NestedStaticClass object=new OuterClass.NestedStaticClass();
		object.test();
	
		
		OuterClass.NestedNonStaticClass obj=new OuterClass().new NestedNonStaticClass();
		obj.test();
		
		
		
	}

}
