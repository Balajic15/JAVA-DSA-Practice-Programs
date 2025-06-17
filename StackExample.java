import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("Popped: " + stack.pop());
        for (int i : stack) System.out.println(i);
    }
}
