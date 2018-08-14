package Conditionals.easy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BiggestOfFive {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double n1 = scanner.nextDouble();
    double n2 = scanner.nextDouble();
    double n3 = scanner.nextDouble();
    double n4 = scanner.nextDouble();
    double n5 = scanner.nextDouble();
    
    DecimalFormat df = new DecimalFormat("0.#######");
    System.out.println(df.format(Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5)));
    
  }
}
