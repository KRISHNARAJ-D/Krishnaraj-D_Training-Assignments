package Exceptional;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CompileDemo {
	public static void main(String[] args)
	{
		String str = "c:\\k.txt";
		try {
			FileInputStream fn = new FileInputStream(str);
		}
		catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
	}
}
