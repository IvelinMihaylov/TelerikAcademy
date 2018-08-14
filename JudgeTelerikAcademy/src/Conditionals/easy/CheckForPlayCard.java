package Conditionals.easy;

import java.util.Scanner;

public class CheckForPlayCard {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String card = scanner.nextLine();
    switch(card) {
	 case "2":
	 case "3":
	 case "4":
	 case "5":
	 case "6":
	 case "7":
	 case "8":
	 case "9":
	 case "10":
	 case "J":
	 case "Q":
	 case "K":
	 case "A":
	   System.out.println("yes " + card);
	   break;
	 default:
	   System.out.println("no " + card);
	   break;
    }
  }
}
