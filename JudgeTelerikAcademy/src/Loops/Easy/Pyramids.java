package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pyramids {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   Double n = Double.parseDouble(in.readLine());
	   System.out.println((int)((Math.sqrt(8*n+1)-1)/2));
    }
}
