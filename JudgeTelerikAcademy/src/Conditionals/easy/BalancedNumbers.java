package Conditionals.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BalancedNumbers {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 long sum = 0;
	 while (true) {
	   String[] n = in.readLine().split("");
	   if (Byte.parseByte(n[0]) + Byte.parseByte(n[2]) == Byte.parseByte(n[1]))
		sum += Long.parseLong((n[0] + n[1] + n[2]));
	   else
		break;
	 }
	 System.out.println(sum);
    } catch (Exception e) {
	 
    }
  }
}
