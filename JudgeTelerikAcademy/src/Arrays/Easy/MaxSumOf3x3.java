package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxSumOf3x3 {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 String[] size = in.readLine().split(" ");
	 short n = Short.parseShort(size[0]);
	 short m = Short.parseShort(size[1]);
	 int[][] matrix = new int[n][m];
	 
	 for(short row = 0; row < n; row++) {
	   String[] fillRow = in.readLine().split(" ");
	   for(short col = 0; col < m; col++) {
		matrix[row][col] = Short.parseShort(fillRow[col]);
	   }
	 }
	 int maxSum = Integer.MIN_VALUE;
	 int sum;
	 
	 for(short i = 0; i < matrix.length - 2; i++) {
	   for(short j = 0; j < matrix[i].length - 2; j++) {
		sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
			   matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
			   matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
		if(maxSum < sum)
		  maxSum = sum;
	   }
	 }
	 System.out.println(maxSum);
	 
    } catch (Exception e) {
	 
    }
  }
}
