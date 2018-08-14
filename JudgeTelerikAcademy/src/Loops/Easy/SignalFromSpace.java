package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SignalFromSpace {
    public static void main(String[] args) {
	   try {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  String[] signal = in.readLine().split("");
		  boolean isWrote = true;
		  for (int i = 0; i < signal.length-1; i++) {
			 
			 if (signal[i].equals(signal[i + 1])) {
				if (isWrote){
				    System.out.print(signal[i]);
				    isWrote=false;
				}
			 }
			 else {
				if (isWrote==false){
				    isWrote=true;
				}else
				    System.out.print(signal[i]);
			 }
			 if (i == signal.length-2) {
				if (!signal[i].equals(signal[i + 1])) {
				    System.out.print(signal[i + 1]);
				}
			 }
		  }
		  System.out.println();
	   } catch (Exception e) {
		  
	   }
    }
}
