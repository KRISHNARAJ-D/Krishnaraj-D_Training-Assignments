package decem8;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");

        System.out.println("Ascending Order:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        System.out.println("\nDescending Order:");
        for (Map.Entry<Integer, String> e : map.descendingMap().entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
