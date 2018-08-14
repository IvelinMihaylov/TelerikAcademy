package LinearDataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Swappings2 {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer size = Integer.parseInt(in.readLine());
    
    String[] input = in.readLine().split(" ");
    int[] nums = new int[input.length];
    for(int i = 0; i < input.length; i++) {
	 nums[i] = Integer.parseInt(input[i]);
    }
    List<ListNode> nodes = new ArrayList<>();
    for(int i = 0; i < size; i++) {
	 nodes.add(i, new ListNode(i + 1));
    }
    for(int i = 1; i < size - 1; i++) {
	 nodes.get(i).Link(nodes.get(i + 1));
    }
    ListNode first = nodes.get(1);
    ListNode last = nodes.get(size - 1);
    
    for(int i = 0; i < nums.length; i++) {
	 ListNode newLast = nodes.get(nums[i]).Left;
	 ListNode newFirst = nodes.get(nums[i]).Right;
	 nodes.get(nums[i]).Detach();
	 if(last != nodes.get(nums[i])) {
	   last.Link(nodes.get(nums[i]));
	 } else {
	   newFirst = nodes.get(nums[i]);
	 }
	 if(first != nodes.get(nums[i])) {
	   nodes.get(nums[i]).Link(first);
	 } else {
	   newLast = nodes.get(nums[i]);
	 }
	 nodes.get(nums[i]).Link(first);
	 
	 first = newFirst;
	 last = newLast;
    }
    StringBuilder result = new StringBuilder();
    for(ListNode num : nodes) {
	 result.append(num.value + " ");
    }
    System.out.println(result);
  }
  
  static class ListNode {
    private int value;
    private ListNode left;
    private ListNode right;
    
    public ListNode Left = left;
    public ListNode Right = right;
    
    public ListNode(int v) {
	 value = v;
	 left = null;
	 right = null;
    }
    
    public void Link(ListNode r) {
	 right = r;
	 r.left = this;
    }
    
    public void Detach() {
	 if(this.left != null) {
	   this.left.right = null;
	 }
	 if(this.right != null) {
	   this.right.left = null;
	 }
	 this.left = null;
	 this.right = null;
    }
  }
}