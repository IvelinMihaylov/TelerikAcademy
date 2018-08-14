package Arrays.Intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class NFactorial {
  public static BigInteger Factorial(int n){
    if (n == 0)
	 return BigInteger.ONE;
    
    return BigInteger.valueOf(n).multiply(Factorial(n-1));
  }
  
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 int n = Integer.parseInt(in.readLine());
	 System.out.println(Factorial(n));
    } catch (Exception e) {
	 
    }
  }
}
