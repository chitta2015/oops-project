package org.oops;

class Employee
{
	int empId;
	String empName;
	double empSalary;
	
	Employee()
	{
		System.out.println("This is default constructor...");
	}
	
	Employee(int empId,String empName,double empSalary)
	{
		this();  //call the default consthructor
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	void test()
	{
		this.demo(this);
		System.out.println("This is test method....");
	}
	
	void display()
	{
		this.test();//call the test method
		System.out.println(this.empId + " "+this.empName + " "+this.empSalary);
	}
	
	void demo(Employee e)
	{
		System.out.println(e.empId + " "+e.empName + " "+e.empSalary);
	}
	
}


public class ThisKeywordTest {

	public static void main(String[] args) {
		
		Employee employee=new Employee(198,"Mr. Raman",30000);
		employee.display();

	}

}
