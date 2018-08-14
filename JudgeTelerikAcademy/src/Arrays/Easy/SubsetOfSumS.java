package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SubsetOfSumS {
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int s = Integer.parseInt(in.readLine());
	   int[] array = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	   boolean[] haved = new boolean[s + 1];
	   haved[0] = true;
	   for(int i = 0; i < array.length; i++) {
		  for(int j = haved.length - 1; j >= 0; j--) {
			 if(haved[j] == true && haved.length > array[i] + j) {
				haved[array[i] + j] = true;
			 }
		  }
	   }
	   System.out.println(haved[s] ? "yes" : "no");
    }
}
