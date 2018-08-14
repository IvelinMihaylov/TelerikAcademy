package Arrays.Intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Indices {
  
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    boolean[] visited = new boolean[n];
    //fill arrayOfIndex
    String[] array = in.readLine().split(" ");
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++) {
	 arr[i] = Integer.parseInt(array[i]);
    }
    StringBuilder result = new StringBuilder();
    int currentIndex = 0;
    int loopStart = -1;
    while(true) {
	 if(currentIndex < 0 || currentIndex >= n) {
	   break;
	 }
	 if(visited[currentIndex]) {
	   loopStart = currentIndex;
	   break;
	 }
	 
	 
	 result.append(currentIndex);
	 result.append(" ");
	 visited[currentIndex] = true;
	 currentIndex = arr[currentIndex];
    }
    int index = result.toString().indexOf((" " + loopStart + " "));
    if(loopStart >= 0) {
	 if(index < 0)
	   result.insert(0, "(");
	 else {
	   result.insert(index, "(");
	   result.deleteCharAt(index + 1);
	 }
	 result.insert(result.length() - 1, ")");
    }
    System.out.println(result);
  }
}

//6
//1 2 3 5 7 8	0 1 2 3 5
//6
//1 2 3 5 7 1	0(1 2 3 5)