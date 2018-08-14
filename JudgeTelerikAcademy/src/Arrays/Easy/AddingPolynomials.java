package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddingPolynomials {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 int n = Integer.parseInt(in.readLine());
	 String[] array1 = in.readLine().split(" ");
	 String[] array2 = in.readLine().split(" ");
	 long[] result = new long[n];
	 for(int i = 0; i < n; i++) {
	   result[i] = Integer.parseInt(array1[i]) + Integer.parseInt(array2[i]);
	 }
	 for(long item : result) {
	   System.out.print(item + " ");
	 }
	 System.out.println();
	 
    } catch (Exception e) {
	 
    }
  }
}