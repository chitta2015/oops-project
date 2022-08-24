package org.oops;

public class TestDog {

	public static void main(String args[])
	{
		Dog obj=new Dog(); //object declaration/creation
		Dog obj1=new Dog("black","xyz","pqr");
		
		
		//Dog obj2=obj1;  //copy constructor
		Dog obj2=new Dog(obj1);
		
		
		obj.setName("Abc");
		obj.setBreed("XYZ");
		obj.setColor("brown");
		
		obj.eating();     //method calling
		obj.waggingTail();
		obj.barking();
		
		System.out.println(obj.breed+" " + obj.color+" " +obj.name);
		System.out.println(obj.getName()+" "+obj.getColor()+" "+obj.getBreed());
		
		System.out.println(obj1.breed+" " + obj1.color+" " +obj1.name);
		System.out.println(obj2.breed+" " + obj2.color+" " +obj2.name);
	}

}
