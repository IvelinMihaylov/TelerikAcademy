package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class BitShiftMatrix {
    public static BigInteger getSum(Boolean[][] visited, int indexRow, int indexCol) {
	   if(visited[indexRow][indexCol]) {
		  visited[indexRow][indexCol] = false;
		  return BigInteger.TWO.pow(Math.abs((visited.length - 1) - indexRow) + indexCol);
	   }
	   return BigInteger.ZERO;
    }
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int rows = Integer.parseInt(in.readLine());
	   int cols = Integer.parseInt(in.readLine());
	   in.readLine();
	   int[] dir = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	   Boolean[][] visited = new Boolean[rows][cols];
	   for(int i = 0; i < visited.length; i++) {
		  for(int j = 0; j < visited[i].length; j++) {
			 visited[i][j] = true;
		  }
	   }
	   int coeff = Math.max(rows, cols);
	   int indexRow = rows - 1;
	   int indexCol = 0;
	   BigInteger sum = BigInteger.ZERO;
	   for(int i = 0; i < dir.length; i++) {
		  int row = dir[i] / coeff;
		  int col = dir[i] % coeff;
		  while(indexCol < col) {
			 sum = sum.add(getSum(visited, indexRow, indexCol));
			 indexCol++;
		  }
		  while(indexCol > col) {
			 sum = sum.add(getSum(visited, indexRow, indexCol));
			 indexCol--;
		  }
		  
		  while(indexRow > row) {
			 sum = sum.add(getSum(visited, indexRow, indexCol));
			 indexRow--;
		  }
		  while(indexRow < row) {
			 sum = sum.add(getSum(visited, indexRow, indexCol));
			 indexRow++;
		  }
	   }
	   sum = sum.add(getSum(visited, indexRow, indexCol));
	   System.out.println(sum);
    }
}