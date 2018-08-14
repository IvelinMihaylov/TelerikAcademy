package Arrays.Easy;

import java.util.Scanner;

public class LongestSequenceOfEqual {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int[] array = new int[n];
    for(int i = 0; i < array.length; i++) {
	 array[i] = scanner.nextInt();
    }
    
    int count = 0;
    int currentCount = 1;
    for(int i = 0; i < array.length - 1; i++) {
	 if(array[i] == array[i + 1]) {
	   currentCount++;
	 } else {
	   currentCount = 1;
	 }
	 
	 if(count < currentCount) {
	   count = currentCount;
	 }
    }
    System.out.println(count);
  }
}
