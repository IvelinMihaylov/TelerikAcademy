package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Password {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] input = in.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);
    StringBuilder result = new StringBuilder();
    int count = 0;
    for(char symbol1 = 'a'; symbol1 < 'a' + m; symbol1++) {
	 
	 for(int symbol2 = 1; symbol2 <= n; symbol2++) {
	   
	   for(char symbol3 = 'a'; symbol3 < 'a' + m; symbol3++) {
		if(symbol3 == symbol1) {
		  continue;
		}
		
		for(int symbol4 = n; symbol4 <= 9; symbol4++) {
		  
		  for(int symbol5 = 1; symbol5 <= n; symbol5++) {
		    if(symbol5 == symbol2) {
			 continue;
		    }
		    result.append(symbol1);
		    result.append(symbol2);
		    result.append(symbol3);
		    result.append(symbol4);
		    result.append(symbol5 + " ");
		    count++;
		  }
		}
	   }
	 }
    }
    if(count > 0) {
	 System.out.println(count);
	 System.out.println(result);
    } else {
	 System.out.println(count);
    }
  }
}
