package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BiggestPrimeNumber {
    public static int biggestPrimeNum(int num) {
	   for(int i = num; i >= 3; i--) {
		  if(num % (i - 1) == 0) {
			 num--;
			 i = num;
		  }
	   }
	   return num;
    }
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   System.out.println(biggestPrimeNum(Integer.parseInt(in.readLine())));
    }
}
