package Loops.Intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeTriangle {
    public static int PrimeCol(int n) {
	   boolean isPrime = true;
	   
	   if(n == 2)
		  isPrime = false;
	   
	   while(isPrime) {
		  for(int i = 2; i < n; i++) {
			 if(n % i == 0) {
				isPrime = true;
				n++;
				break;
			 } else if(i == n - 1 && n % i != 0) {
				isPrime = false;
			 }
		  }
	   }
	   return n;
    }
    
    public static int PrimeRow(int n) {
	   boolean isPrime = true;
	   
	   int count = 0;
	   while(n != 2) {
		  for(int i = 2; i < n; i++) {
			 if(n % i == 0) {
				isPrime = true;
				n--;
				break;
			 } else if(i == n - 1 && n % i != 0) {
				count++;
				n--;
			 }
		  }
	   }
	   return count + 2;
    }
    
    public static int IsPrime(int n) {
	   boolean isPrime = true;
	   
	   if(n == 2 || n == 1)
		  return 1;
	   
	   while(isPrime) {
		  for(int i = 2; i < n; i++) {
			 if(n % i == 0) {
				return 0;
			 } else if(i == n - 1 && n % i != 0) {
				return 1;
			 }
		  }
	   }
	   return 0;
    }
    
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  int n = Integer.parseInt(in.readLine());
		  int cols = PrimeCol(n);
		  int col = 1;
		  int rows = PrimeRow(n);
		  
		  for(int row = 0; row < rows; row++) {
			 for(int i = 0; i < col; i++) {
				System.out.print(IsPrime(i + 1));
			 }
			 System.out.println();
			 if(col <= cols) {
				col++;
				col = PrimeCol(col);
			 }
		  }
	   } catch (Exception e) {
		  
	   }
    }
}
