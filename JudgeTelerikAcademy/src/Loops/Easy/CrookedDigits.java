package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CrookedDigits {
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  String n = in.readLine().replace(".", "").replace("-", "");
		  while (new BigInteger(n).compareTo(BigInteger.valueOf(10)) > -1) {
			 BigInteger sum = BigInteger.ZERO;
			 for (int i = 0; i < n.length(); i++) {
				sum = sum.add(new BigInteger(n.substring(i, i + 1)));
			 }
			 n = sum.toString();
		  }
		  System.out.println(Long.parseLong(n));
	   } catch (Exception e) {
		  
	   }
    }
}
