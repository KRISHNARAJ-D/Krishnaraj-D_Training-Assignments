package Collections;
import java.util.*;
public class TreeSetDemo
{
	public static void main(String[] args)
	{
		Set<Integer> s1 = new TreeSet<>();
		s1.add(3);
		s1.add(2);
		s1.add(6);
		s1.add(1);
		s1.remove(6);
		for(int n1:s1)
		{
			System.out.println(n1);
		}
			
	
	}
}
