package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpiralMatrix {
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  int n = Integer.parseInt(in.readLine());
		  
		  int[][] matrix = new int[n][n];
		  
		  int fill = 1;
		  
		  int rowUp = 0;
		  int colLeft = 0;
		  
		  int rowDown = n;
		  int colRight = n;
		  
		  int row = 0;
		  int col = 0;
		  
		  int stopRow;
		  int stopCol;
		  if (n % 2 == 0) {
			 stopRow = n / 2 + 1;
			 stopCol = n / 2;
		  } else {
			 stopRow = n / 2 + 1;
			 stopCol = n / 2 + 1;
		  }
		  
		  while (stopCol != col && stopRow != row) {
			 //From left to right.
			 row = rowUp;
			 col = colLeft;
			 while (col >= colLeft && col < colRight) {
				matrix[row][col] = fill;
				fill++;
				col++;
			 }
			 
			 col--;
			 rowUp++;
			 row = rowUp;
			 
			 //From up to down.
			 while (row >= rowUp && row < rowDown) {
				matrix[row][col] = fill;
				fill++;
				row++;
			 }
			 
			 row--;
			 colRight--;
			 col = colRight - 1;
			 
			 //From right to left.
			 while (col >= colLeft && col < colRight) {
				matrix[row][col] = fill;
				fill++;
				col--;
			 }
			 
			 col++;
			 rowDown--;
			 row = rowDown-1;
			 
			 //From down to up.
			 while (row >= rowUp && row < rowDown) {
				matrix[row][col] = fill;
				fill++;
				row--;
			 }
			 
			 row++;
			 colLeft++;
			 col = colLeft;
		  }
		  
		  //Print matrix.
		  for (int[] rowOfItem : matrix) {
			 for (int colOfItem : rowOfItem) {
				System.out.print(colOfItem + " ");
			 }
			 System.out.println();
		  }
	   } catch (Exception e) {
		  System.out.println(e);
	   }
    }
}
