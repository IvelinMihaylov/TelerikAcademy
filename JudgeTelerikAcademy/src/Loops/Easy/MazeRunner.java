package Loops.Easy;

import java.util.Scanner;

public class MazeRunner {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int n = scanner.nextInt();
	   int[] array = new int[n];
	   for (int i = 0; i < n; i++) {
		  array[i] = scanner.nextInt();
	   }
	   int odd = 0;
	   int even = 0;
	   for (int i = 0; i < array.length; i++) {
		  while (array[i] != 0) {
			 if (array[i] % 2 == 0) {
				even += array[i] % 10;
				array[i] /= 10;
			 }
			 else {
				odd += array[i] % 10;
				array[i] /= 10;
			 }
		  }
		  if (even == odd)
			 System.out.println("straight");
		  else if (even > odd)
			 System.out.println("left");
		  else
			 System.out.println("right");
		  even = 0;
		  odd = 0;
	   }
    }
}
