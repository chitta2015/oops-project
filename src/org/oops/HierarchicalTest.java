package org.oops;

class A1
{
	public void testA()
	{
		System.out.println("testA method invoked..");
	}
}

class B1 extends A1
{
	public void testB()
	{
		System.out.println("testB method invoked..");
	}
}


class C1 extends A1
{
	public void testC()
	{
		System.out.println("testC method invoked..");
	}
}


public class HierarchicalTest {

	public static void main(String[] args) {
		
		B1 b=new B1();
		b.testA();
		
		C1 c=new C1();
		c.testA();
	}

}
