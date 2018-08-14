package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Calculate {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   //S = 1 + 1!/x + 2!/x2 + … + N!/xN.
	   Integer n = Integer.parseInt(in.readLine());
	   Double x = Double.parseDouble(in.readLine());
	   
	   Double s = 1.0;
	   Double factorial = 1.0;
	   
	   for(int i = 1; i < n + 1; i++) {
		  factorial *= i;
		  s += factorial / Math.pow(x, (double) i);
	   }
	   
	   DecimalFormat df = new DecimalFormat("#0.00000");
	   System.out.println(df.format(s));
    }
}