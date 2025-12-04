package oops;

class Employee{
	int empNo = 001;
	String empName = "Krishna";
	void displayEmpl()
	{
		System.out.println(empName);
	}
	
}
class Payment extends Employee{
	float extrapay = 50000;
	void displayDetails()
	{
		System.out.println("Employee "+empName+" emp no is "+empNo+" get extra of "+extrapay);
	}
}
public class Inheritance {
	public static void main(String[] args)
	{
		Payment p = new Payment();
		
		p.displayDetails();
		p.displayEmpl();
	}

}
