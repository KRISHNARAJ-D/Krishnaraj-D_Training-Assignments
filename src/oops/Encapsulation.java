package oops;

class Oops_Demo {
    private int empID = 12;
    private String empName = "Krishna";
    private float salary = 35500.500f;

    public void displayDetails() {
        System.out.println("Emp ID: " + empID + 
                           " Emp Name: " + empName + 
                           " Employee Salary: " + salary);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Oops_Demo o = new Oops_Demo();

        System.out.println(o.getEmpName());
        o.displayDetails();
    }
}
