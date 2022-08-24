package org.oops;

class A     //Parent class
{
 private String parentMsg;
 
  public void parentTest()
  {
	  System.out.println("Parent class method..");
  }
	
}


class B extends A
{
	private String childMsg;
	
	public void childTest()
	{
		System.out.println("Child class method..");
	}
}


class C extends B
{
private String subChildMsg;
	
	public void subChildTest()
	{
		System.out.println("subChild class method..");
	}
}




public class SingleInheritance {

	public static void main(String[] args) {
		C ob=new C();
		
		ob.subChildTest();//accessing own property
		
		ob.childTest(); //accessing parent property
		
		
		ob.parentTest();  //accessing grandparent method
		

	}

}
