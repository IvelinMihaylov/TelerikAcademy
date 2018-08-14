package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseArray {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] n = in.readLine().split(" ");
    for (int i = n.length-1; i > 0 ; i--) {
	 System.out.print(n[i] + ", ");
    }
    System.out.println(n[0]);
  }
}
