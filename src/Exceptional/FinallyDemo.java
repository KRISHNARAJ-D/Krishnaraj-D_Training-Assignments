package Exceptional;

public class FinallyDemo {
    public static void main(String[] args) {

        int a = 10, b = 0, c = 0;

        try {
            c = a / b;   
            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        finally {
            System.out.println("Finally block executed — cleanup done.");
        }

        System.out.println("Program continues normally...");
    }
}
