package Arrays.Intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bounce {
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int[] size = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//	   int row = 0;
//	   int col = 0;
//	   int dirRow = 1;
//	   int dirCol = 1;
//	   long sum = 0;
//	   while(!(atCorner(row, col, size[0], size[1]))) {
//		  sum += getSum(row, col);
//		  row += dirRow;
//		  col += dirCol;
//		  if(row == size[0] - 1) {
//			 dirRow = -1;
//			 dirCol = +1;
//		  }
//		  if(col == size[1] - 1) {
//			 dirRow = -1;
//			 dirCol = -1;
//		  }
//		  if(row == 0) {
//			 dirRow = +1;
//			 dirCol = -1;
//		  }
//	   }
//	   sum += getSum(row, col);
//	   System.out.println(sum);
//    }
//
//    public static long getSum(int row, int col) {
//	   return (long) Math.pow(2, row + col);
//    }
//
//    public static boolean atCorner(int row, int col, int rows, int cols) {
//	   return row == 0 && col == -1 ||
//		  row == rows - 1 && col == cols - 1 ||
//		  row == rows - 1 && col == 0;
//    }
	   int row = 1;
	   int col = 1;
	   int dirRow = 1;
	   int dirCol = 1;
	   long sum = 1;
	   if(size[0] != 1) {
		  while(!(atCorner(row, col, size[0], size[1]))) {
			 sum += getValue(row, col);
			 int nextRow = row + dirRow;
			 if(nextRow < 0 || nextRow > size[0] - 1) {
				dirRow *= -1;
			 }
			 
			 int nextCol = col + dirCol;
			 if(nextCol < 0 || nextCol > size[1] - 1) {
				dirCol *= -1;
			 }
			 row += dirRow;
			 col += dirCol;
		  }
		  sum += getValue(row, col);
	   }
	   System.out.println(sum);
    }
    
    private static long getValue(int row, int col) {
	   int power = row + col;
	   return (long) Math.pow(2, power);
    }
    
    private static boolean atCorner(int row, int col, int rows, int cols) {
	   return ((row == 0 || row == rows - 1) && (col == 0 || col == cols - 1));
    }
}