package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Windows {
  public static void main(String[] args) throws Exception {
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[] inputFirstLine = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int n = inputFirstLine[0];
    int cost = inputFirstLine[1];
    int sum = 0;
    for(int i = 0; i < n; i++) {
	 int[] secondInputLine = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	 if(secondInputLine[2] == 1) {
	   sum += (secondInputLine[0] * secondInputLine[1]) * cost;
	 }
    }
    System.out.println(sum);
  }
}
