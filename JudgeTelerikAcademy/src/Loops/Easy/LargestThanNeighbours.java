package Loops.Easy;

import java.io.DataInputStream;

public class LargestThanNeighbours {
    public static void main(String[] args) {
	   try {
		  DataInputStream in = new DataInputStream(System.in);
		  int n = Integer.parseInt(in.readLine());
		  String[] array = in.readLine().split(" ");
		  int count = 0;
		  for(int i = 1; i < n - 1; i++) {
			 if(Long.parseLong(array[i - 1]) < Long.parseLong(array[i]) &&
				Long.parseLong(array[i]) > Long.parseLong(array[i + 1]))
				count++;
		  }
		  System.out.println(count);
	   } catch (Exception e) {
		  
	   }
    }
}
