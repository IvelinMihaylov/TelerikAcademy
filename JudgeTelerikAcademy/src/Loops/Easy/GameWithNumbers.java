package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GameWithNumbers {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   String[] firstLine = in.readLine().split(" ");
	   Integer lonyNum = Integer.parseInt(firstLine[1]);
	   double[] elephantNum = Arrays.stream(in.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
	   int[] scores = new int[elephantNum.length];
	   
	   for(int i = 2; i < lonyNum + 1; i++) {
		  for(int j = 0; j < elephantNum.length ; j++) {
			 if(elephantNum[j] % i == 0 && lonyNum % i == 0) {
				++scores[j];
			 }
		  }
	   }
	   
	   int max = Arrays.stream(scores).max().getAsInt();
	   if(max == 0) {
		  System.out.println("No winners");
	   } else {
		  System.out.println(max);
		  for(int i = 0; i < scores.length; i++) {
			 if(scores[i] == max) {
				System.out.print(i + 1 + " ");
			 }
		  }
	   }
    }
}