package Conditionals.easy;

import java.util.Scanner;

public class MultiplicationSign {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    
    double n1 = scanner.nextDouble();
    double n2 = scanner.nextDouble();
    double n3 = scanner.nextDouble();
    
    if(n1 == 0 || n2 == 0 || n3 == 0)
	 System.out.println("0");
    else if(n1 < 0 && n2 > 0 && n3 > 0 ||
		  n1 > 0 && n2 < 0 && n3 > 0 ||
		  n1 > 0 && n2 > 0 && n3 < 0 ||
		  n1 < 0 && n2 < 0 && n3 < 0)
	 System.out.println("-");
    else
	 System.out.println("+");
  }
}
