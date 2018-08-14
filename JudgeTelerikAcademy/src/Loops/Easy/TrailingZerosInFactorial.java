package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrailingZerosInFactorial {
    static int findTrailingZeros(int n) {
	   int count = 0;
	   for(int i = 5; n / i >= 1; i *= 5)
		  count += n / i;
	   
	   return count;
    }
    
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  int n = Integer.parseInt(in.readLine());
		  System.out.println(findTrailingZeros(n));
	   } catch (Exception e) {
		  
	   }
    }
}
