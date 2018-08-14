package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class AboveTheMainDiagonal {
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   Integer n = Integer.parseInt(in.readLine());
	   if (n == 1)
		  System.out.println(0);
	   else {
		  BigInteger sum = BigInteger.valueOf(2);
		  BigInteger rowSum = BigInteger.valueOf(2);
		  BigInteger colSum;
		  for (int row = n - 1; row > 1; row--) {
			 rowSum = rowSum.multiply(BigInteger.valueOf(2));
			 colSum = rowSum;
			 for (int col = 0; col < n - row; col++) {
				sum = sum.add(colSum);
				colSum = colSum.multiply(BigInteger.valueOf(2));
			 }
			 sum = sum.add(colSum);
		  }
		  System.out.println(sum);
	   }
    }
}
