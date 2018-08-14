package LinearDataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class PathToOne {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer number = Integer.parseInt(in.readLine());
    int count = 0;
    HashSet<Integer> pathToOne = new HashSet<>();
    pathToOne.add(number);
    boolean work = true;
    while(work) {
	 HashSet<Integer> temp = new HashSet<>();
	 for(Integer num : pathToOne) {
	   if(num % 2 == 0) {
		temp.add(num / 2);
	   }
	   temp.add(--num);
	   ++num;
	   temp.add(++num);
	   --num;
	   
	 }
	 for(Integer num : temp) {
	   if(num == 1) {
		work = false;
	   }
	   pathToOne.add(num);
	 }
	 count++;
    }
    System.out.println(count);
  }
}
