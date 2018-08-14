package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hotels {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   in.readLine();
	   int[] weights = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	   int frontCount = 0;
	   int endCount = 0;
	   int currentTown = 0;
	   for(int s = 0; s < weights.length; s++) {
		  if(currentTown < weights[s]) {
			 ++frontCount;
			 currentTown = weights[s];
		  }
	   }
	   currentTown = weights[weights.length - 1] - 1;
	   for(int e = weights.length - 1; e >= 0; e--) {
		  if(weights[e] > currentTown) {
			 ++endCount;
			 currentTown = weights[e];
		  }
	   }
	   System.out.println(frontCount + " " + endCount);
    }
}
