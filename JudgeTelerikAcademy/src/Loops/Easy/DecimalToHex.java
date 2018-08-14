package Loops.Easy;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   long decimalNum = scanner.nextLong();
	   StringBuilder result = new StringBuilder();
	   int remainder = 0;
	   while(decimalNum != 0) {
		  remainder = (int) (decimalNum % 16);
		  decimalNum /= 16;
		  
		  
		  switch(remainder) {
			 case 15:
				result.append("F");
				break;
			 case 14:
				result.append("E");
				break;
			 case 13:
				result.append("D");
				break;
			 case 12:
				result.append("C");
				break;
			 case 11:
				result.append("B");
				break;
			 case 10:
				result.append("A");
				break;
			 case 9:
				result.append("9");
				break;
			 case 8:
				result.append("8");
				break;
			 case 7:
				result.append("7");
				break;
			 case 6:
				result.append("6");
				break;
			 case 5:
				result.append("5");
				break;
			 case 4:
				result.append("4");
				break;
			 case 3:
				result.append("3");
				break;
			 case 2:
				result.append("2");
				break;
			 case 1:
				result.append("1");
				break;
			 case 0:
				result.append("0");
				break;
		  }
	   }
	   System.out.println(result.reverse());
    }
}
