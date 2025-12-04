package Exceptional;
public class MultipleExceptionDemo {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;            // ArithmeticException
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            String s = null;
            System.out.println(s.length()); // NullPointerException
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
        catch (NullPointerException e) {
            System.out.println("Error: Null value encountered!");
        }
        catch (Exception e) {
            System.out.println("General Exception occurred!");
        }

        System.out.println("Program continues normally...");
    }
}
