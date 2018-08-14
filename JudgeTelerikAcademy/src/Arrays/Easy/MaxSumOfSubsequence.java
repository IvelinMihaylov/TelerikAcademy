package Arrays.Easy;

import java.util.Scanner;

public class MaxSumOfSubsequence {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    
    for (int i = 0; i < n ; i++) {
	 array[i] = scanner.nextInt();
    }
    int maxSumSoFar=0;
    for(int i=0; i<n; i++){
	 int sum=0;
	 for(int j=i; j<n; j++){
	   sum+=array[j];
	   if(sum>maxSumSoFar){
		maxSumSoFar=sum;
	   }
	 }
    }
    System.out.println(maxSumSoFar);
  }
}
