package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class NotDivisableNumber {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   Integer n = Integer.parseInt(in.readLine());
	   IntStream.range(1, n + 1)
		  .filter(x -> !(x % 3 == 0 || x % 7 == 0))
		  .forEach(x -> System.out.print(x + " "));
    }
}
