package Arrays.Easy;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class MaxSumOfKElements {
    public static void main(String[] args) throws Exception {
	   Scanner in = new Scanner(System.in);
	   Integer n = in.nextInt();
	   Integer k = in.nextInt();
	   Integer sum = Stream.generate(in::nextInt)
		  .limit(n)
		  .sorted(Comparator.reverseOrder())
		  .limit(k)
		  .mapToInt(x -> x)
		  .sum();
	   System.out.println(sum);
    }
}