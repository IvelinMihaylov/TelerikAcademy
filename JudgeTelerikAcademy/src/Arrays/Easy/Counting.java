package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Counting {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 String n = in.readLine().replace("solve([\"", "");
	 n = n.replace("\"]);", "");
	 BigInteger num = new BigInteger(n);
	 
	 for (int i = 0; i < 10 ; i++) {
	   num=num.add(BigInteger.ONE);
	   System.out.println(num);
	 }
	 
    } catch (Exception e) {
	 
    }
  }
}
