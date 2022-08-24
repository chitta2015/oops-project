package org.oops;

public class Student {

	String name;
	int roll;
	String standard;
	Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", standard=" + standard + ", address=" + address + "]";
	}
	
	public static void main(String args[])
	{
		Address address=new Address();
		address.setStreetNo(34);
		address.setCity("Bangalore");
		address.setState("Karnakata");
		address.setCountry("India");
		
		Student student=new Student();
		student.setName("Robin");
		student.setRoll(23);
		student.setStandard("Fifth");
		student.setAddress(address);
		
		System.out.println(student);
	}
	
	
}
