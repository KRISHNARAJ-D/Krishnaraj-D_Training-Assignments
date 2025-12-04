package Exceptional;

public class IndexBoundExceptionDemo {
	 public static void main(String[] args) {
		 int arr[] = {10, 20, 30};

	        try {
	            System.out.println(arr[3]);
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Invalid index! Array size is only " + arr.length);
	        }

	        System.out.println("Program continues normally..."); 
	    }

}
