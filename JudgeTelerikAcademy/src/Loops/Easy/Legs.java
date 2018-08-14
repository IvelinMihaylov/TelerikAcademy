package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Legs {
    public static void main(String[] args) throws Exception {
	   
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   
	   Integer legs = Integer.parseInt(in.readLine());
	   Integer sumOfCombination = 0;
	   
	   for (int i = 0; i < legs + 1; i += 7) {
		  for (int j = i; j < legs + 1; j += 5) {
			 if ((legs - j) % 2 == 0) {
				sumOfCombination++;
			 }
		  }
	   }
	   System.out.println(sumOfCombination);
    }
}
