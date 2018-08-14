package Conditionals.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class KaspichanNumbers {
  
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    String[] arr = new String[256];
    for(int i = 0; i < 256; i++) {
	 if(i < 26)
	   arr[i] = String.valueOf((char) (i + 'A'));
	 else
	   arr[i] = String.valueOf((char) (i / 26 - 1 + 'a')) + String.valueOf((char) (i % 26 + 'A'));
    }
    
    String result = "";
    BigInteger input = new BigInteger(in.readLine());
    if(input.compareTo(BigInteger.ZERO) == 0)
	 System.out.println("A");
    else {
	 while(input.compareTo(BigInteger.ZERO) == 1) {
	   int index = Integer.parseInt((input.mod(BigInteger.valueOf(256))).toString());
	   input = input.divide(BigInteger.valueOf(256));
	   result = arr[index] + result;
	 }
	 System.out.println(result);
    }
  }
}
