package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SymetricArrays {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    
    for (int i = 0; i < n; i++) {
	 boolean symmetric = true;
	 String[] array = in.readLine().split(" ");
	 for (int begin = 0, end = array.length - 1; begin <= (array.length - 1) / 2; begin++, end--) {
	   if (!array[begin].equals(array[end])) {
		symmetric = false;
		break;
	   }
	 }
	 System.out.println(symmetric ? "Yes" : "No");
    }
  }
}
