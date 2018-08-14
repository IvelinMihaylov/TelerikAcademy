package Loops.Easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculate3 {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   int n = scanner.nextInt();
	   int k = scanner.nextInt();
	   
	   BigInteger firstFactorial = BigInteger.ZERO;
	   BigInteger secondFactorial = BigInteger.ZERO;
	   BigInteger factorialNK = BigInteger.ZERO;
	   for(int i = 0; i <= n; i++) {
		  if(i == 0) {
			 firstFactorial = BigInteger.ONE;
			 secondFactorial = BigInteger.ONE;
			 factorialNK = BigInteger.ONE;
		  } else {
			 firstFactorial = firstFactorial.multiply(BigInteger.valueOf(i));
			 if(i <= k)
				secondFactorial = secondFactorial.multiply(BigInteger.valueOf(i));
			 if(i <= (n - k))
				factorialNK = factorialNK.multiply(BigInteger.valueOf(i));
		  }
	   }
	   
	   System.out.println(firstFactorial.divide((secondFactorial.multiply(factorialNK))));
    }
}
