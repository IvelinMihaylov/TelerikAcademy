package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ArraySearch {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] numberInput = in.readLine().split(",");
    boolean[] isFound = new boolean[numberInput.length+1];
    for(int i = 0; i < numberInput.length; i++) {
	 isFound[Integer.parseInt(numberInput[i])] = true;
    }
    StringBuilder result = new StringBuilder();
    for(int i = 1; i < isFound.length; i++) {
	 if(isFound[i] == false){
	   result.append(i + ",");
	 }
    }
    if(result.length()>0) {
	 result.deleteCharAt(result.length() - 1);
    }
    System.out.println(result);
  }
}
