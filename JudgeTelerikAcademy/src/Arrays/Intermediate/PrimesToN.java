package Arrays.Intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimesToN {
  public static boolean isPrime(Integer n) {
    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
	 if (n % i == 0) {
	   isPrime = false;
	 }
    }
    return isPrime;
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer n = Integer.parseInt(in.readLine());
    for (int i = 1; i <= n; i++) {
	 if (isPrime(i)) {
	   System.out.print(i + " ");
	 }
    }
  }
}
