package org.oops;

public class Circle {
	
	private double radius;
	
	Circle()
	{
		
	}
	
	Circle(double radius)
	{
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI * this.radius * this.radius;
	}
	
	
	public double getCircumference()
	{
		return 2 * Math.PI * this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.setRadius(6);
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		System.out.println(circle);
		System.out.println(circle.getRadius());
	}
	

}
