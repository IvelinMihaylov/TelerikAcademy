package Arrays.Easy;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

public class MissCat {
  public static void main(String[] args) {
    try {
	 DataInputStream in = new DataInputStream(System.in);
	 int n = Integer.parseInt(in.readLine());
	 int[] array = new int[n];
	 for (int i = 0; i < n; i++) {
	   array[i] = Integer.parseInt(in.readLine());
	 }
	 int name = 0;
	 int count = 0;
	 int current = 1;
	 Arrays.sort(array);
	 
	 if (array.length == 1)
	   System.out.println(array[0]);
	 else {
	   for (int i = 0; i < n; i++) {
		
		if (i < array.length - 1) {
		  if (array[i] == array[i + 1])
		    current++;
		  else
		    current = 1;
		} else {
		  if (array[i - 1] == array[i])
		    current++;
		  else
		    current = 1;
		}
		if (count < current) {
		  count = current;
		  name = array[i];
		}
	   }
	   System.out.println(name);
	 }
    } catch (IOException e) {
	 
    }
  }
}
