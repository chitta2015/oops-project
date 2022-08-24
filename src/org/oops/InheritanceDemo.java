package org.oops;

class Circle1
{
	private double radius;
	private String color;
	
	
	public Circle1() {
		
		this.radius=1.0;
		this.color="red";
	}

	

	public Circle1(double radius) {
		
		this.radius = radius;
		
	}



	public Circle1(double radius, String color) {
		
		this.radius = radius;
		this.color = color;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return "Circle1 [radius=" + radius + ", color=" + color + "]";
	}
	
	
	public double getArea()//pi * r * r
	{
		return Math.PI * this.radius * this.radius;
	}
	
}

class Cylinder extends Circle1
{
	private double height;

	
	
	public Cylinder() {
		super();
		height=1.0;
	}



	public Cylinder(double radius) {
		super(radius);
		height=1.0;
		
	}
	
	
	public Cylinder(double radius, double height) {
		
		super(radius);
		this.height = height;
	}
	
	
	public Cylinder(double radius, double height, String color)
	{
		super(radius,color);
		this.height=height;
		
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double getVolume()
	{
		return getArea()*this.height;  //pi * r * r * h
	}
	
	
	
	
}




public class InheritanceDemo {

	public static void main(String[] args) {
		
		Cylinder c1=new Cylinder();
		System.out.println(c1.getRadius() + " "+c1.getHeight() + " "+c1.getColor() + " "+c1.getArea()+" "+c1.getVolume());
		
		Cylinder c2=new Cylinder(10.0);
		System.out.println(c2.getRadius() + " "+c2.getHeight() + " "+c2.getColor() + " "+c2.getArea()+" "+c2.getVolume());
		
		Cylinder c3=new Cylinder(5.9,7.5);
		System.out.println(c3.getRadius() + " "+c3.getHeight() + " "+c3.getColor() + " "+c3.getArea()+" "+c3.getVolume());
		
		Cylinder c4=new Cylinder(5.3,7.7,"green");
		System.out.println(c4.getRadius() + " "+c4.getHeight() + " "+c4.getColor() + " "+c4.getArea()+" "+c4.getVolume());
	}

}
