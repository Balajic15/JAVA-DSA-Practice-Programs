import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.remove(2);
        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
