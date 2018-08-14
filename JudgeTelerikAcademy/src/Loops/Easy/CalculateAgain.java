package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class CalculateAgain {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   Integer n = Integer.parseInt(in.readLine());
	   Integer k = Integer.parseInt(in.readLine());
	   
	   BigDecimal firstFactorial = BigDecimal.ZERO;
	   BigDecimal secondFactorial = BigDecimal.ZERO;
    
	   for (int i = 0 ; i <= n ; i++)
	   {
		  if (i == 0) {
			 firstFactorial = BigDecimal.ONE;
			 secondFactorial = BigDecimal.ONE;
		  }
		  else {
			 firstFactorial = firstFactorial.multiply(BigDecimal.valueOf(i));
			 if(i<=k)
				secondFactorial = secondFactorial.multiply(BigDecimal.valueOf(i));
		  }
	   }
	   System.out.println(firstFactorial.divide(secondFactorial));
    }
}