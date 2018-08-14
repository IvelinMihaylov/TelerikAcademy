package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Tribonacci {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   BigInteger first = BigInteger.valueOf(Long.parseLong(in.readLine()));
	   BigInteger second = BigInteger.valueOf(Long.parseLong(in.readLine()));
	   BigInteger third = BigInteger.valueOf(Long.parseLong(in.readLine()));
	   BigInteger fourth = first.add(second).add(third);
	   Integer n = Integer.parseInt(in.readLine());
	   switch(n) {
		  case 1:
			 fourth = first;
			 break;
		  case 2:
			 fourth = second;
			 break;
		  case 3:
			 fourth = third;
			 break;
	   }
	   for(int i = 5; i <= n; i++) {
		  first = fourth;
		  fourth = fourth.add(third).add(second);
		  second = third;
		  third = first;
	   }
	   System.out.println(fourth);
    }
}