package Exceptional;

public class ThrowDemo {
	public static void main(String[] args)
	{
		int a=10, b=2, c=0;
		try {
			c = a/b;
			throw new NullPointerException(); //we create a exception so we found which exception is caught
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divided by Zero has occured, Correct the Code");
		}
		catch(Exception e)
		{
			e.printStackTrace();// it shows the exception
		}
		System.out.println("The value of c is: "+c);
	}
	

}
