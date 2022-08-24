package org.oops;

public class EmployeeInfo {
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	public EmployeeInfo(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

    public String getName()
    {
    	return this.firstName + " "+this.lastName;
    }
    
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary()
	{
		return this.salary*12;
	}
	
	
	public int raiseSalary(int percent)
	{
		return this.salary=this.salary + ((this.salary*percent)/100);
	}


	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	
	public static void main(String args[])
	{
		EmployeeInfo employee=new EmployeeInfo(123,"Raman","Roy",20000);
		
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getAnnualSalary());
		System.out.println(employee.raiseSalary(5));
	}
	
   
}
