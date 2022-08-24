package org.oops;

public class Dog {
	
	//instance variable
	String color;
	String name;
	String breed;
	
	
	
    //Default constructor
	public Dog() {
		System.out.println("default constructor invoked");
	}
	
	
    //Parameterized constructor
	public Dog(String color, String name, String breed) {
		System.out.println("parameterized constructor invoked");
		this.color = color;
		this.name = name;
		this.breed = breed;
	}
	
	//Copy constructor
	public Dog(Dog obj)
	{
		System.out.println("copy constructor invoked");
		this.color = obj.color;
		this.name = obj.name;
		this.breed = obj.breed;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	//methods
	public void waggingTail()
	{
		System.out.println("This is waggingTail method");
	}
	
	public void eating()
	{
		System.out.println("This is eat method");
	}
	
	public void barking()
	{
		System.out.println("This is barking method");
	}
	
	

}
