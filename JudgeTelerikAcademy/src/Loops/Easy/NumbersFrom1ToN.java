package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class NumbersFrom1ToN {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   IntStream.range(1,Integer.parseInt(in.readLine())+1)
		  .forEach(x -> System.out.print(x + " "));
    }
}
