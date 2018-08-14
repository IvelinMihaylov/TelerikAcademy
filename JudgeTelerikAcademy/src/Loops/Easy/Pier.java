package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pier {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   in.readLine();
	   int[] weights = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
	   Arrays.stream(weights).forEach(System.out::println);
//	   TODO http://judge.telerikacademy.com/problem/l3p2ukrasanakeya
	   
    }
}