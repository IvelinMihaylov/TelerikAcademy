package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SequenceInMatrix {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[] size = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    matrix = new int[size[0]][size[1]];
    boolean[][] visited = new boolean[size[0]][size[1]];
//    fill matrix.
    for(int i = 0; i < matrix.length; i++) {
	 int[] line = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	 for(int j = 0; j < matrix[i].length; j++) {
	   matrix[i][j] = line[j];
	   visited[i][j] = true;
	 }
    }
//    DFS
    for(int i = 0; i < matrix.length; i++) {
	 for(int j = 0; j < matrix[i].length; j++) {
	   dfs(matrix[i][j], i, j, visited);
	   if(count > bestCount) {
		bestCount = count;
	   }
	   count = 0;
	 }
    }
    System.out.println(bestCount);
  }
  
  public static int[][] matrix;
  public static int count = 0;
  public static int bestCount = 0;
  
  public static void dfs(int search, int r, int c, boolean visited[][]) {
    if(visited[r][c] && search == matrix[r][c]) {
	 count++;
	 visited[r][c] = false;
//	 System.out.println(search + " {" + r + " " + c + "} Count: " + count);
	 if(r - 1 >= 0) {
	   dfs(search, r - 1, c, visited);
	 }
	 if(c - 1 >= 0) {
	   dfs(search, r, c - 1, visited);
	 }
	 if(r + 1 < visited.length) {
	   dfs(search, r + 1, c, visited);
	 }
	 if(c + 1 < visited[r].length) {
	   dfs(search, r, c + 1, visited);
	 }
	 if(c + 1 < visited[r].length && r + 1 < visited.length){
	   dfs(search, r+1, c + 1, visited);
	 }
	 if(c - 1 >= 0 && r + 1 < visited.length){
	   dfs(search, r+1, c -1, visited);
	 }
	 if(r - 1 >= 0 && c - 1 >= 0){
	   dfs(search, r-1, c -1, visited);
	 }
	 if(r - 1 >= 0 && c + 1 < visited[r].length ){
	   dfs(search, r-1, c +1, visited);
	 }
    }
  }
}
