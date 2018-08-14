package Conditionals.easy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeIfGreater {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    
    DecimalFormat df = new DecimalFormat("#.####");
    
    if (a>b)
	 System.out.println(df.format(b) + " " + df.format(a));
    else
	 System.out.println(df.format(a) + " " + df.format(b));
  }
}
