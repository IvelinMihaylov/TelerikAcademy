package Combinatorics.intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Speeds {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 int n = Integer.parseInt(in.readLine());
	 long[] cars = new long[n];
	 long sum = 0;
	 long currentSum = 0;
	 int count = 0;
	 int currentCount = 0;
	 long firstCar = 0;
	 for(int i = 0; i < n; i++) {
	   cars[i] = Integer.parseInt(in.readLine());
	   
	   if(i > 0) {
		if(firstCar < cars[i]) {
		  currentSum += cars[i];
		  currentCount++;
		} else {
		  if(count < currentCount) {
		    sum = currentSum;
		    count = currentCount;
		  } else if(count == currentCount) {
		    if(sum < currentSum)
			 sum = currentSum;
		  }
		  
		  currentCount = 1;
		  firstCar = cars[i];
		  currentSum = cars[i];
		}
	   } else {
		firstCar = cars[i];
		currentSum += firstCar;
		currentCount++;
	   }
	 }
	 
	 if(count < currentCount) {
	   sum = currentSum;
	 } else if(count == currentCount) {
	   if(sum < currentSum)
		sum = currentSum;
	 }
	 System.out.println(sum);
    } catch (Exception e) {
	 System.out.println(e);
    }
  }
}
