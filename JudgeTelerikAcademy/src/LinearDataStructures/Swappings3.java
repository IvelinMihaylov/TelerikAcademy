package LinearDataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Swappings3 {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer size = Integer.parseInt(in.readLine());
    
    String[] input = in.readLine().split(" ");
    int[] num = new int[input.length];
    
    List<Node> list = new ArrayList<>();
    Node tail = new Node(0);
    list.add(tail);
    
    for(int i = 1; i <= size; i++) {
	 
	 Node next = new Node(i);
	 tail.link(next);
	 list.add(next);
	 tail = tail.next;
	 
    }
    Node head = list.get(1);
    
    for(int i = 0; i < input.length; i++) {
	 num[i] = Integer.parseInt(input[i]);
	 
	 Node mid = list.get(num[i]);
	 Node start = mid.next;
	 Node end = mid.previous;
	 mid.detach();
	 
	 if(mid == tail) {
	   start = mid;
	 } else
	   tail.link(mid);
	 
	 if(mid == head) {
	   end = mid;
	 } else
	   mid.link(head);
	 
	 head = start;
	 tail = end;
    }
    print(head);
  }
  
  public static void print(Node x) {
    
    StringBuilder result = new StringBuilder();
    while(x != null) {
	 result.append(x.value).append(" ");
	 x = x.next;
    }
    System.out.println(result);
    
  }
  
  static class Node {
    private Node next;
    private Node previous;
    private int value;
    
    public Node(int value) {
	 this.value = value;
	 next = null;
	 previous = null;
    }
    
    public void link(Node x) {
	 this.next = x;
	 x.previous = this;
    }
    
    public void detach() {
	 if(this.previous != null) {
	   this.previous.next = null;
	   this.previous = null;
	 }
	 if(this.next != null) {
	   this.next.previous = null;
	   this.next = null;
	 }
    }
  }
  
}