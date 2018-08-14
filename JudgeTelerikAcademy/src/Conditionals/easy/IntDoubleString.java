package Conditionals.easy;

import java.util.Scanner;

public class IntDoubleString {
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    String dataType = read.nextLine();
    
    switch (dataType) {
	 case "integer":
	   int valueInteger = read.nextInt();
	   System.out.println(++valueInteger);
	   read.close();
	   break;
	 
	 case "real":
	   double valueDouble = read.nextDouble();
	   System.out.println(String.format("%.2f", valueDouble + 1.00));
	   break;
	 
	 case "text":
	   String valueText = read.nextLine();
	   valueText += "*";
	   System.out.println(valueText);
	   break;
    }
  }
}
