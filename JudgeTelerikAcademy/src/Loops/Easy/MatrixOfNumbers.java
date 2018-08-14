package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixOfNumbers {
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(in.readLine());
	   for(int i = 0; i < n; i++) {
		  int start = 1 + i;
		  for(int j = 0; j < n; j++) {
			 System.out.print(j + start + " ");
		  }
		  System.out.println();
	   }
    }
}
