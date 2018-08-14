package LinearDataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Swappings {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer size = Integer.parseInt(in.readLine());
//    int[] nums = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    String[] input = in.readLine().split(" ");
    int[] nums = new int[input.length];
    for(int i = 0; i < input.length; i++) {
	 nums[i] = Integer.parseInt(input[i]);
    }
    DynamicDeque deque = new DynamicDeque();
    
    for(int i = 0; i < size; i++) {
	 deque.push(i + 1);
    }
    
    for(int i = 0; i < nums.length; i++) {
	 deque.swap(nums[i]);
    }
    StringBuilder result = new StringBuilder();
    
    while(!deque.isEmpty()) {
	 result.append(deque.pop() + " ");
    }
    System.out.println(result);
  }
  
  public static class DynamicDeque {
    private Node head;
    private Node tail;
    
    public DynamicDeque() {
	 head = null;
	 tail = null;
    }
    
    public boolean isEmpty() {
	 return head == null;
    }
    
    public void push(int number) {
	 Node newElement = new Node(number);
	 if(isEmpty()) {
	   head = newElement;
	   tail = newElement;
	 } else {
	   newElement.prev = tail;
	   tail.next = newElement;
	   tail = newElement;
	 }
    }
    
    public int pop() {
	 if(isEmpty()) {
	   throw new NullPointerException();
	 }
	 int value = head.value;
	 head = head.next;
	 return value;
    }
    
    public void swap(int changer) {
	 Node search = head;
	 while(search.value != changer) {
	   search = search.next;
	 }
	 if(search == tail) {
	   head.prev = tail;
	   tail.next = head;
	   head = tail;
	   tail = tail.prev;
	   tail.next = null;
	   return;
	 }
	 Node temp = search.next;
	 head.prev = search;
	 search.next = head;
	 head = temp;
	 
	 temp = search.prev;
	 tail.next = search;
	 search.prev = tail;
	 tail = temp;
	 
	 head.prev = null;
	 tail.next = null;
    }
  }
  
  public static class Node {
    protected Node next;
    protected Node prev;
    protected Integer value;
    
    public Node(Integer value) {
	 next = null;
	 prev = null;
	 this.value = value;
    }
  }
}