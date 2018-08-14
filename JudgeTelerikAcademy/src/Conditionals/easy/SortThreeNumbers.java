package Conditionals.easy;

import java.util.Scanner;

public class SortThreeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int first = scanner.nextInt();
    int second = scanner.nextInt();
    int third = scanner.nextInt();
    
    if(first > second) {
	 if(first > third) {
	   if(second > third)
		System.out.println(first + " " + second + " " + third);
	   else
		System.out.println(first + " " + third + " " + second);
	 } else {
	   if(first > second)
		System.out.println(third + " " + first + " " + second);
	   else
		System.out.println(third + " " + second + " " + first);
	 }
    } else {
	 if(second > third) {
	   if(first > third)
		System.out.println(second + " " + first + " " + third);
	   else
		System.out.println(second + " " + third + " " + first);
	 } else {
	   if(first > second)
		System.out.println(third + " " + first + " " + second);
	   else
		System.out.println(third + " " + second + " " + first);
	 }
    }
  }
}
