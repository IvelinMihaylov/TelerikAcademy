package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MergingAndSquashing {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 short n = Short.parseShort(in.readLine());
	 String[] array = new String[n];
	 String[] merging = new String[n - 1];
	 String[] squashing = new String[n - 1];
	 for (int i = 0; i < array.length; i++) {
	   array[i] = in.readLine();
	   if (i > 0) {
		merging[i - 1] = array[i - 1].substring(array[i - 1].length() - 1, array[i - 1].length()) +
			   array[i].substring(0, 1);
		
		squashing[i - 1] = array[i - 1].substring(0, 1) +
			   (Integer.parseInt(array[i - 1].substring(array[i - 1].length() - 1, array[i - 1].length()))
					 + Integer.parseInt(array[i].substring(0, 1)))%10 +
			   array[i].substring(array[i].length() - 1, array[i].length());
	   }
	 }
	 for (String item : merging){
	   System.out.print(item + " ");
	 }
	 System.out.println();
	 for (String item : squashing){
	   System.out.print(item + " ");
	 }
	 System.out.println();
    } catch (Exception e) {
	 
    }
  }
}
