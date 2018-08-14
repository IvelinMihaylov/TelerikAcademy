package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MinMaxSumAverage {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   Integer n = Integer.parseInt(in.readLine());
	   Double min = Double.MAX_VALUE;
	   Double max = -9999999.00;
	   Double sum = 0.0;
	   Double avg;
	   for(int i = 0; i < n; i++) {
		  Double digit = Double.parseDouble(in.readLine());
		  if(min > digit) {
			 min = digit;
		  }
		  if(max < digit) {
			 max = digit;
		  }
		  sum += digit;
	   }
	   avg = sum / (double)n;
	   DecimalFormat df = new DecimalFormat("0.00");
	   System.out.println("min=" + df.format(min) + "\nmax=" + df.format(max) + "\nsum=" + df.format(sum) + "\navg=" + df.format(avg));
    }
}
