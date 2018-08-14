package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class AboveTheMainDiagonal2 {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer n = Integer.parseInt(in.readLine());
    
    BigInteger colSum = BigInteger.ONE;
    BigInteger rowSum = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;
    
    for(int row = 0; row < n; row++) {
	 for(int col = 0 + row; col < n; col++) {
	   sum = sum.add(colSum);
	   colSum = colSum.add(colSum);
	 }
	 rowSum = rowSum.multiply(BigInteger.valueOf(4));
	 colSum = rowSum;
    }
    System.out.println(sum);
  }
}
