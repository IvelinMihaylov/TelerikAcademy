package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintDeck {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   String n = in.readLine();
	   int length;
	   if(n.equals("J"))
		  length = 11;
	   else if(n.equals("Q"))
		  length = 12;
	   else if(n.equals("K"))
		  length = 13;
	   else if(n.equals("A"))
		  length = 14;
	   else
		  length = Integer.parseInt(n);
	   
	   for(int i = 2; i <= length; i++) {
		  if(i > 14) {
			 break;
		  }
		  if(i == 11) {
			 System.out.println("J of spades, J of clubs, J of hearts, J of diamonds");
		  } else if(i == 12) {
			 System.out.println("Q of spades, Q of clubs, Q of hearts, Q of diamonds");
		  } else if(i == 13) {
			 System.out.println("K of spades, K of clubs, K of hearts, K of diamonds");
		  } else if(i == 14) {
			 System.out.println("A of spades, A of clubs, A of hearts, A of diamonds");
		  } else {
			 System.out.printf("%1$s of spades, %1$s of clubs, %1$s of hearts, %1$s of diamonds", i);
			 System.out.println();
		  }
	   }
    }
}