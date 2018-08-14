package Arrays.Easy;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

public class MostFrequent {
  public static void main(String[] args) {
    try {
	 DataInputStream in = new DataInputStream(System.in);
	 int n = Integer.parseInt(in.readLine());
	 //int n = Character.getNumericValue((char)System.in.read());
	 
	 int[] array = new int[n];
	 for(int i = 0; i < n; i++) {
	   //array[i] = Character.getNumericValue((char)System.in.read());
	   array[i] = Integer.parseInt(in.readLine());
	 }
	 Arrays.sort(array);
	 
	 int num = 0;
	 int count = 0;
	 int current = 1;
	 for(int i = 0; i < array.length; i++) {
	   if(current > count) {
		num = array[i];
		count = current;
	   }
	   if(i < array.length - 2) {
		if(array[i] == array[i + 1])
		  current++;
		else
		  current = 1;
	   }
	   if(i == array.length - 2 && array[i] == array[i + 1])
		current++;
	 }
	 System.out.println(num + " (" + count + " times)");
    } catch (IOException e) {
	 
    }
  }
}
