package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DogeCoin {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] size = in.readLine().split(" ");
    int rows = Integer.parseInt(size[0]);
    int cols = Integer.parseInt(size[1]);
    int k = Integer.parseInt(in.readLine());
    int[][] grid = new int[rows][cols];
    for(int i = 0; i < k; i++) {
	 String[] position = in.readLine().split(" ");
	 int r = Integer.parseInt(position[0]);
	 int c = Integer.parseInt(position[1]);
	 grid[r][c] += 1;
    }
    for(int r = 0; r < rows; r++) {
	 for(int c = 0; c < cols; c++) {
	   System.out.print(grid[r][c]+" ");
	 }
	 System.out.println();
    }
  }
}
