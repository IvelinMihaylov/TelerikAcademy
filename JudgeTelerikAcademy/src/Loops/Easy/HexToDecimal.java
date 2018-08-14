package Loops.Easy;

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   String hexNum = scanner.nextLine();
	   String current = null;
	   Long result = 0L;
	   int k = hexNum.length()-1;
	   for (int i = 0; i < hexNum.length(); i++,k--) {
		  current = hexNum.substring(i,i+1);
		  switch (current){
			 case "0":
				result += 0;
				break;
			 case "1":
				result += 1*(long)Math.pow(16,k);
				break;
			 case "2":
				result += 2*(long)Math.pow(16,k);
				break;
			 case "3":
				result += 3*(long)Math.pow(16,k);
				break;
			 case "4":
				result += 4*(long)Math.pow(16,k);
				break;
			 case "5":
				result += 5*(long)Math.pow(16,k);
				break;
			 case "6":
				result += 6*(long)Math.pow(16,k);
				break;
			 case "7":
				result += 7*(long)Math.pow(16,k);
				break;
			 case "8":
				result += 8*(long)Math.pow(16,k);
				break;
			 case "9":
				result += 9*(long)Math.pow(16,k);
				break;
			 case "A":
				result += 10*(long)Math.pow(16,k);
				break;
			 case "B":
				result += 11*(long)Math.pow(16,k);
				break;
			 case "C":
				result += 12*(long)Math.pow(16,k);
				break;
			 case "D":
				result += 13*(long)Math.pow(16,k);
				break;
			 case "E":
				result += 14*(long)Math.pow(16,k);
				break;
			 case "F":
				result += 15*(long)Math.pow(16,k);
				break;
		  }
	   }
	   System.out.println(result);
    }
}
