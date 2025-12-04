package oops;

class Employees{
	int empID = 001;
	int display()
	{
		return empID;
	}
	void display(String ename)
	{
		System.out.println("Employee name: " + ename);
	}
	void display(int x)
	{
		System.out.println(x);
	}
	void display(int x, int y)
	{
		System.out.println(x+" "+y);
	}
	void display(int a, float b)
	{
		System.out.println(a+" "+b);
	}
	void display(float a, int b)
	{
		System.out.println(a+" "+b);
	}
}


public class MethodOverloading {
	public static void main(String[] args)
	{
		Employees emp = new Employees();
		emp.display("KRishna");
		emp.display(5);
		emp.display(5,6);
		emp.display(5,3.4f);
		emp.display(2.1f,5);
	}
}
