package Collections;
import java.util.*;
public class Generic 
{
	public static void main(String[] args)
	{
		List<String> l1 = new ArrayList<>();
		l1.add("121");
		l1.add("Krishnaraj");
		l1.add("Krishna");
		l1.add("Krish");
		l1.add("Krishnaraj.D");
		l1.add(5,"Hello");
		//System.out.print(l1);
		for(String s1:l1)
		{
			System.out.println(s1);
		}
		l1.remove("Krish");
		l1.add("D.Krishnaraj");
			System.out.println(l1);
	}
}
