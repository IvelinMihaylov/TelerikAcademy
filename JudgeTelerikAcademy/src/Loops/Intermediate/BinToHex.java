package Loops.Intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinToHex {
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  StringBuilder binNum = new StringBuilder(in.readLine());
		  String[] hexAlphabet = "0123456789ABCDEF".split("");
		  StringBuilder hexNum = new StringBuilder();
		  
		  while(binNum.length() % 4 != 0) {
			 binNum.insert(0, 0);
		  }
		  
		  for(int i = 0; i < binNum.length(); i += 4) {
			 switch((binNum.substring(i, i + 4))) {
				case "0000":
				    hexNum.append(0);
				    break;
				case "0001":
				    hexNum.append(1);
				    break;
				case "0010":
				    hexNum.append(2);
				    break;
				case "0011":
				    hexNum.append(3);
				    break;
				case "0100":
				    hexNum.append(4);
				    break;
				case "0101":
				    hexNum.append(5);
				    break;
				case "0110":
				    hexNum.append(6);
				    break;
				case "0111":
				    hexNum.append(7);
				    break;
				case "1000":
				    hexNum.append(8);
				    break;
				case "1001":
				    hexNum.append(9);
				    break;
				case "1010":
				    hexNum.append("A");
				    break;
				case "1011":
				    hexNum.append("B");
				    break;
				case "1100":
				    hexNum.append("C");
				    break;
				case "1101":
				    hexNum.append("D");
				    break;
				case "1110":
				    hexNum.append("E");
				    break;
				case "1111":
				    hexNum.append("F");
				    break;
			 }
		  }
		  
		  System.out.println(hexNum);
	   } catch (Exception e) {
		  
	   }
    }
}
