package Arrays.Easy;

import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int n = scanner.nextInt();
	   
	   int[] array = new int[n];
	   for(int i = 0; i < array.length; i++) {
		  array[i] = scanner.nextInt();
	   }
	   int count = 0;
	   int currnetCount = 0;
	   for(int i = 0; i < array.length - 1; i++) {
		  if(array[i] < array[i + 1]) {
			 currnetCount++;
		  } else {
			 if(count < currnetCount)
				count = currnetCount + 1;
			 
			 currnetCount = 0;
		  }
	   }
	   System.out.println(count);
    }
}
