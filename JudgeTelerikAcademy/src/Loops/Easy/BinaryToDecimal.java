package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryToDecimal {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   String binaryNum = in.readLine();
	   int decimalNum = 0;
	   int exponentiation = 0;
	   for(int i = binaryNum.length() - 1; i >= 0; i--, exponentiation++) {
		  decimalNum += Character.getNumericValue(binaryNum.charAt(i)) * Math.pow(2, exponentiation);
	   }
	   System.out.println(decimalNum);
    }
}