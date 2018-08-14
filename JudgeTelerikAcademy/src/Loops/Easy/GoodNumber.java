package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoodNumber {
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  String[] input = in.readLine().split(" ");
		  int n = Integer.parseInt(input[0]);
		  int m = Integer.parseInt(input[1]);
		  int count = 0;
		  
		  for(int i = n; i <= m; i++) {
			 int num = i;
			 int division = 0;
			 boolean isGood = true;
			 while(num != 0) {
				division = num % 10;
				num /= 10;
				if(division != 0) {
				    if(i % division != 0)
					   isGood = false;
				}
			 }
			 if(isGood)
				count++;
		  }
		  System.out.println(count);
	   } catch (Exception e) {
		  
	   }
    }
}
