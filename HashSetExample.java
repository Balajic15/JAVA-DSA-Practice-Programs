import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); 
        set.add("C++");
        set.remove("Python");
        for (String s : set) System.out.println(s);
    }
}
