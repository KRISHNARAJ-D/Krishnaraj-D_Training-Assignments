package oops;

class EmployeeDetails {
	int empId = 001;
	String empName = "Krishna";
	float empSalary = 45345.453f;

	void displayEmpDetails() {
		System.out.println("Emp id: " + empId + " Emp Name: " + empName + " Emp Salary: " + empSalary);
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		EmployeeDetails s = new EmployeeDetails();
		System.out.println(s.empName);
		s.displayEmpDetails();
	}

}
