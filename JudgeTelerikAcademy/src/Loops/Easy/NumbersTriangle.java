package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumbersTriangle {
    
    public static void drawTriangleIncrease(Integer n) {
	   for(int i = 0; i <= n; i++) {
		  for(int j = 1; j <= i; j++) {
			 System.out.print(j + " ");
		  }
		  System.out.println();
	   }
    }
    
    public static void drawTriangleDecrease(Integer n) {
	   for(int i = n - 1; i > 0; i--) {
		  for(int j = 1; j <= i; j++) {
			 System.out.print(j + " ");
		  }
		  System.out.println();
	   }
    }
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   Integer n = Integer.parseInt(in.readLine());
	   drawTriangleIncrease(n);
	   drawTriangleDecrease(n);
    }
}
