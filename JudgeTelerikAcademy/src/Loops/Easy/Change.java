package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Change {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   String[] input = in.readLine().split(" ");
	   BigInteger paid = new BigInteger(input[0]);
	   BigInteger cost = new BigInteger(input[1]);
	   System.out.println(paid.subtract(cost));
    }
}