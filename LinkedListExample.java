import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addFirst(5);
        list.addLast(20);
        list.removeFirst();
        for (int i : list) System.out.println(i);
    }
}
