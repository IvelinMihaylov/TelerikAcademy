package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   String input = in.readLine();
	   StringBuilder output = new StringBuilder();
	   for(int i = input.length() - 1; i >= 0; i--) {
		  output.append(input.charAt(i));
	   }
	   System.out.println(output);
    }
}