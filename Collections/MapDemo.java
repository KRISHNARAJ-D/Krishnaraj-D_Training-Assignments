package Collections;
import java.util.*;
public class MapDemo 
{
	public static void main(String[] args)
	{
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "Krishna");
		m1.put(2, "Hello");
		m1.put(3, "World");
		m1.put(1, "Key");
		m1.put(4, "World");
		m1.put(1, null);
		m1.put(5, null);
		for (Map.Entry<Integer, String> e : m1.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
	}
}
