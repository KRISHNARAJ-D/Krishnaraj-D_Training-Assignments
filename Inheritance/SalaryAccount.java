package InheritanceAssignment;
class SalaryAccount extends BankAccount {
    private double monthlySalary;

    public SalaryAccount(String accountNo, double balance, double monthlySalary) {
        super(accountNo, balance);
        this.monthlySalary = monthlySalary;
    }

    void creditSalary() {
        balance += monthlySalary;
        System.out.println("Salary Credited: " + monthlySalary);
    }
}
