package Collections;
import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Queue<String> animal1 = new LinkedList<>();
        Queue<String> animal2 = new ArrayDeque<>();
        Queue<String> animal3 = new PriorityQueue<>();
        list.add(23);
        list.add(34);
        list.add(55);
        System.out.println("List : " + list);
        System.out.println("Index 2 is : " + list.get(2));
        list.set(2,44);
        System.out.println("Index 2 is changed. Current value is : " + list.get(2));
        list.remove(2);                             //List add, remove, change methods usage examples
        System.out.println("---------------------------------");
        stack.push("hello");
        stack.push("world");
        stack.push("hi");
        stack.push("universe");
        System.out.println("Our stack is : " + stack);
        System.out.println("Top value of the stack :" + stack.peek());
        System.out.println("Is the stack empty? Answer is " + stack.empty());



    }
}
