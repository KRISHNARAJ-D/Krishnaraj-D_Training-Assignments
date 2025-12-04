package Collections;
import java.util.*;
public class NonGeneric {
	public static void main(String[] args)
	{
		List l1  = new ArrayList<>();
		l1.add(101);
		l1.add("Krishna");
		System.out.println(l1);
		String s1 = (String)l1.get(1);
		System.out.println(s1);
	}
}
