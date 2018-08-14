package Loops.Intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class TribonacciTriangle {
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  BigInteger a = BigInteger.valueOf(Integer.parseInt(in.readLine()));
		  BigInteger b = BigInteger.valueOf(Integer.parseInt(in.readLine()));
		  BigInteger c = BigInteger.valueOf(Integer.parseInt(in.readLine()));
		  int n = Integer.parseInt(in.readLine());
		  BigInteger result;
		  System.out.println(a);
		  System.out.println(b + " " + c);
		  for (int j = 3; j <= n; j++) {
			 for (int i = 0; i < j; i++) {
				result = a.add(b).add(c);
				a = b;
				b = c;
				c = result;
				System.out.print(result + " ");
			 }
			 System.out.println();
		  }
		  
	   } catch (Exception e) {
		  System.out.println(e);
	   }
    }
}
