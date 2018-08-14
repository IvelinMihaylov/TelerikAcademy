package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddOrEvenProduct {
    public static void main(String[] args) throws Exception{
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   long n = Long.parseLong(in.readLine());
	   String[] num = in.readLine().split(" ");
	   long even = 1;
	   long odd = 1;
	   for (int i = 0; i < n; i++) {
		  if (i % 2 == 0)
			 even *= Integer.parseInt(num[i]);
		  else
			 odd *= Integer.parseInt(num[i]);
	   }
	   if (even == odd)
		  System.out.println("yes " + even);
	   else
		  System.out.println("no " + even + " " + odd);
    }
}
