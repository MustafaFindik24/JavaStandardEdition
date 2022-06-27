package Collections;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Lists {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Queue<String> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(5);
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(5);

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
        System.out.println("----------------------------------");
        linkedList1.add(100);
        linkedList1.add(200);
        linkedList1.add(300);
        System.out.println(linkedList1);
        linkedList1.add(1,10);                            //adding data with index value
        linkedList1.add(1,20);
        System.out.println(linkedList1);
        System.out.println(linkedList1.get(3));
        System.out.println(linkedList1.set(3,700));
        System.out.println(linkedList1);
        System.out.println(linkedList1.remove(1));
        System.out.println(linkedList1);
        linkedList1.removeLast();
        System.out.println(linkedList1);
        System.out.println("----------------------------------");
        arrayDeque.add("mehmet");
        arrayDeque.addFirst("halil");
        arrayDeque.addLast("mahmut");
        System.out.println(arrayDeque);
        System.out.println("----------------------------------");
       /* arrayBlockingQueue.add("horse");
        arrayBlockingQueue.add("donkey");
        arrayBlockingQueue.add("elephant");
        arrayBlockingQueue.offer("cat");
        arrayBlockingQueue.offer("dog");*/
        System.out.println(arrayBlockingQueue);
        System.out.println(arrayBlockingQueue.offer("mouse"));
        arrayBlockingQueue.put("hello");
        arrayBlockingQueue.put("hi");
        arrayBlockingQueue.put("abc");
        System.out.println(arrayBlockingQueue);
        String element = arrayBlockingQueue.take();
        System.out.println("Removed element is : " + element);
        System.out.println("----------------------------------");
        linkedBlockingQueue.add("fatma");
        linkedBlockingQueue.add("seyda");
        linkedBlockingQueue.add("ozge");
        linkedBlockingQueue.offer("sevval");
        System.out.println(linkedBlockingQueue);
        System.out.println(linkedBlockingQueue.peek());             // returns front of the linked blocing queue
        Iterator<String> iterate = linkedBlockingQueue.iterator();  // usage of iterator interface for listing our queue

        /*while (iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(",");
        }*/
        System.out.println(linkedBlockingQueue.remove());
        System.out.println(linkedBlockingQueue);
    }
}
