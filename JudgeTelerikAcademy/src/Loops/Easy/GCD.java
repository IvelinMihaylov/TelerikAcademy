package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCD {
    public static int findGCD(int number1, int number2) {
	   if (number2 == 0) {
		  return number1;
	   }
	   return findGCD(number2, number1 % number2);
    }
    
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  String[] nums = in.readLine().split(" ");
		  System.out.println(findGCD(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));
		  
	   } catch (Exception e) {
		  
	   }
    }
}
