package Conditionals.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Flasks {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 String[] input = in.readLine().split(" ");
	 long flask = Long.parseLong(input[0]);
	 long litre = Long.parseLong(input[1]);
	 long flaskLitre = 0;
	 for(int i = 2; i <= flask; i++) {
	   flaskLitre += i - 1;
	   if(i % 2 != 0) {
		if(litre <= flaskLitre) {
		  System.out.println(i);
		  break;
		}
	   }
	 }
    } catch (Exception e) {
	 
    }
  }
}
