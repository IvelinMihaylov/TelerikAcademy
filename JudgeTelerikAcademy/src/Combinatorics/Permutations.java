package Combinatorics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Permutations {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(in.readLine());
	   List<Integer> permutation = Stream.generate(() -> 0).limit(n).collect(Collectors.toList());
	   getAllPermutations(0, n, permutation, new HashSet<>());
    }
    
    private static void getAllPermutations(int index, int n, List<Integer> permutation, HashSet<Integer> used) {
	   if(index == n) {
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
		  getAllPermutations(index + 1, n, permutation, used);
		  used.remove(value);
	   }
    }
}