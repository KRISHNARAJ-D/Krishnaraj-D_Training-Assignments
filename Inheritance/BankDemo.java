package InheritanceAssignment;
public class BankDemo {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA001", 5000, 5);
        sa.deposit(1000);
        sa.addInterest();
        sa.withdraw(2000);
        System.out.println("Final Savings Balance: " + sa.balance);

        System.out.println("--------------------------------");

        SalaryAccount sal = new SalaryAccount("SAL001", 2000, 30000);
        sal.creditSalary();
        sal.withdraw(5000);
        System.out.println("Final Salary Balance: " + sal.balance);
    }
}
