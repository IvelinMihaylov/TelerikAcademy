package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CatalanNumbers {
    
    public static BigInteger factorial(int n) {
	   if(n <= 1) {
		  return BigInteger.ONE;
	   }
	   return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(in.readLine());
	   System.out.println(factorial(2 * n).divide(factorial(n + 1).multiply(factorial(n))));
    }
}
