package Exceptional;

public class ArithmeticDemo {
	public static void main(String[] args)
	{
		int a=10, b=0, c=0;
		try {
			c = a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divided by Zero has occured, Correct the Code");
			// or System.out.println(ae.getMessage()); output: / by zero
		}
		System.out.println("The value of C is: "+c);
	}

}
