package Loops.Easy;

import java.util.Scanner;

public class GetLargestNumber {
    public static int GetMax(int a, int b) {
	   return a < b ? b : a;
    }
    
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   int a = scanner.nextInt();
	   int b = scanner.nextInt();
	   int c = scanner.nextInt();
	   
	   System.out.println(GetMax(GetMax(a, b), c));
    }
}
