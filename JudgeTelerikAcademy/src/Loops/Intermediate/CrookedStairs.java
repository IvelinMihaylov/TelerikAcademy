package Loops.Intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CrookedStairs {
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  BigInteger a = new BigInteger(in.readLine());
		  BigInteger b = new BigInteger(in.readLine());
		  BigInteger c = new BigInteger(in.readLine());
		  BigInteger nextBrick;
		  int brickCount = Integer.parseInt(in.readLine());
		  System.out.println(a);
		  System.out.println(b + " " + c);
		  for(int i = 3; i <= brickCount; i++) {
			 for(int j = 0; j < i; j++) {
				nextBrick = a.add(b).add(c);
				a = b;
				b = c;
				c = nextBrick;
				System.out.print(nextBrick + " ");
			 }
			 System.out.println();
		  }
	   } catch (Exception e) {
		  System.out.println(e);
	   }
    }
}
