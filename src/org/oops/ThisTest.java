package org.oops;

class Test
{
	String msg;
	Test()
	{
		System.out.println("This is default constructor..");
	}
	
	Test(String msg)
	{
		this();    //Calling default constructor
		this.msg=msg; //accessing instance variable
		this.display(this);//passing this as method argument
	}
	
	void display(Test t)
	{
	    t=this.returnThis();  //calling another method using this 
		System.out.println(t.msg); 
	}
	
	
	Test returnThis()
	{
		return this;   //returning current class instance with this
	}
	
}


public class ThisTest {

	public static void main(String[] args) {
		
		Test ob=new Test("Hello World!!");

	}

}
