package Collections;
import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Queue<String> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        Queue<String> arrayDeque = new ArrayDeque<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>();
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
        System.out.println("----------------------------------");
        linkedList.offer("hi");
        linkedList.offer("guys");
        linkedList.offer("my");
        linkedList.offer("name");
        linkedList.offer("is");
        linkedList.offer("Mustafa");
        System.out.println("Queue : " + linkedList);
        System.out.println("Header of the queue is : " + linkedList.peek());
        System.out.println("Removed element is : " + linkedList.remove());
        System.out.println("New header is : " + linkedList.peek());
        System.out.println("The element of removed header and returned :" + linkedList.poll());
        System.out.println(linkedList.peek());
        System.out.println("----------------------------------");
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        System.out.println(priorityQueue);
        priorityQueue.offer(5);
        System.out.println(priorityQueue);
    }
}
