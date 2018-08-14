package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class AllocateArray {
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   IntStream.range(0, Integer.parseInt(in.readLine())).map(x -> x * 5).forEach(System.out::println);
    }
}