package Conditionals.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Game {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 int n = Integer.parseInt(in.readLine());
	 int c = n % 10;
	 n /= 10;
	 int b = n % 10;
	 n /= 10;
	 int a = n % 10;
	 int max = Math.max(a * b + c, a + b * c);
	 max = Math.max(max, a + b + c);
	 max = Math.max(max, a * b * c);
	 System.out.println(max);
	 
    } catch (Exception e) {
	 System.out.println(e);
    }
  }
}
