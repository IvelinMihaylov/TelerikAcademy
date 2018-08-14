package Loops.Intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HexToBin {
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  String[] hex = in.readLine().split("");
		  StringBuilder binNum = new StringBuilder();
		  for(int i = 0; i < hex.length; i++) {
			 switch(hex[i]) {
				case "0":
				    binNum.append("0000");
				    break;
				case "1":
				    binNum.append("0001");
				    break;
				case "2":
				    binNum.append("0010");
				    break;
				case "3":
				    binNum.append("0011");
				    break;
				case "4":
				    binNum.append("0100");
				    break;
				case "5":
				    binNum.append("0101");
				    break;
				case "6":
				    binNum.append("0110");
				    break;
				case "7":
				    binNum.append("0111");
				    break;
				case "8":
				    binNum.append("1000");
				    break;
				case "9":
				    binNum.append("1001");
				    break;
				case "A":
				    binNum.append("1010");
				    break;
				case "B":
				    binNum.append("1011");
				    break;
				case "C":
				    binNum.append("1100");
				    break;
				case "D":
				    binNum.append("1101");
				    break;
				case "E":
				    binNum.append("1110");
				    break;
				case "F":
				    binNum.append("1111");
				    break;
			 }
		  }
		  while(true) {
			 if(binNum.substring(0, 1).equals("0"))
				binNum = binNum.deleteCharAt(0);
			 else
				break;
		  }
		  System.out.println(binNum);
	   } catch (Exception e) {
		  
	   }
    }
}
