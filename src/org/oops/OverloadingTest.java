package org.oops;

class Addition
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	
	public void add(long a,long b)
	{
		System.out.println(a+b);
	}
	
	
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		Addition ob=new Addition();
		ob.add(4567888L, 78324324L);
		ob.add(12, 67,89);
		ob.add(10, 20, 30, 40);
		ob.add(23.7, 89.4);

	}

}
