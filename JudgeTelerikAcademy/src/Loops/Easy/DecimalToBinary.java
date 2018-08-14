package Loops.Easy;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int decimalNum = scanner.nextInt();
	   StringBuilder binaryNum = new StringBuilder();
	   if(decimalNum == 0)
		  System.out.println(0);
	   else {
		  while(true) {
			 if(decimalNum % 2 == 0)
				binaryNum.append(0);
			 else
				binaryNum.append(1);
			 decimalNum /= 2;
			 if(decimalNum == 1) {
				binaryNum.append(1);
				break;
			 }
		  }
		  System.out.println(binaryNum.reverse());
	   }
    }
}
