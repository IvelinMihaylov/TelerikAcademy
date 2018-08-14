package Conditionals.easy;

import java.util.Scanner;

public class LeastMajorityMultiple {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    int e = scanner.nextInt();
    int count;
    for(int i = 1; true; i++) {
	 count = 0;
	 if(i % a == 0)
	   count++;
	 if(i % b == 0)
	   count++;
	 if(i % c == 0)
	   count++;
	 if(i % d == 0)
	   count++;
	 if(i % e == 0)
	   count++;
	 if(count >= 3) {
	   System.out.println(i);
	   break;
	 }
    }
  }
}
