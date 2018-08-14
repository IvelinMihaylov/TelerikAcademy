package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JoroTheRabbit {
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int[] path = Arrays.stream(in.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
	   int bestLength = 1;
	   for(int startPosition = 0; startPosition < path.length; startPosition++) {
		  for(int step = 0; step < path.length; step++) {
			 int length = 1;
			 int index = startPosition;
			 //next = (index + step) % path.length;
			 int next = index + step;
			 if(next > path.length - 1) {
				next -= path.length;
			 }
			 while(path[index] < path[next]) {
				length++;
				index = next;
				next = index + step;
				if(next > path.length - 1) {
				    next -= path.length;
				}
			 }
			 if(bestLength < length) {
				bestLength = length;
			 }
		  }
	   }
	   System.out.println(bestLength);
    }
}