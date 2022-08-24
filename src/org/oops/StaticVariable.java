package org.oops;

public class StaticVariable {
	
	private int a; //non static variable
	static int b;  //static variable

	public static void main(String[] args) {
		
		StaticVariable ob=new StaticVariable();
		ob.a=100;
		ob.b=100;
		
		StaticVariable ob1=new StaticVariable();
		ob1.a=200;
		ob1.b=200;
		
		StaticVariable ob2=new StaticVariable();
		ob2.a=300;
		ob2.b=300;
		
		StaticVariable ob3=new StaticVariable();
		ob2.a=400;
		ob2.b=400;
		
		System.out.println(ob.a);
		System.out.println(ob1.a);
		System.out.println(ob2.a);
		System.out.println();
		System.out.println(ob.b);
		System.out.println(ob1.b);
		System.out.println(ob2.b);

	}

}
