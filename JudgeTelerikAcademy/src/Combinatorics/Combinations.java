package Combinatorics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Combinations {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int[] input = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	   List<Integer> permutation = Stream.generate(() -> 0).limit(input[1]).collect(Collectors.toList());
	   getAllCombinations(0, input[0], input[1], permutation, new HashSet<>());
    }
    //да върнем без огледални повторения.
    private static void getAllCombinations(int index, int n, int k, List<Integer> permutation, HashSet<Integer> used) {
	   if(index == k) {
		  // permutation.forEach(System.out::print);
		  for(int item : permutation) {
			 System.out.print(item + " ");
		  }
		  System.out.println();
		  return;
	   }
	   for(int value = 1; value < n + 1; value++) {
		  if(used.contains(value)) {
			 continue;
		  }
		  used.add(value);
		  permutation.set(index, value);
		  getAllCombinations(index + 1, n, k, permutation, used);
		  used.remove(value);
	   }
    }
}
