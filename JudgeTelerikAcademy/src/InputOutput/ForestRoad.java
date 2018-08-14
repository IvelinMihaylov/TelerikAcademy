package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ForestRoad {
  public static void main(String[] args) {
    try {
	 
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 
	 int n = Integer.parseInt(in.readLine());
	 
	 boolean isTrue = true;
	 int i = 0;
	 while (true) {
	   if (isTrue) {
		System.out.println(String.format("%1$s%2$s%3$s",
			   new String(new char[i]).replace("\0", "."), "*",
			   new String(new char[n - 1 - i]).replace("\0", ".")));
		if (i < n - 1)
		  i++;
		else
		  isTrue = false;
	   } else {
		i--;
		System.out.println(String.format("%1$s%2$s%3$s",
			   new String(new char[i]).replace("\0", "."), "*",
			   new String(new char[n - 1 - i]).replace("\0", ".")));
		if (i == 0)
		  break;
	   }
	 }
    } catch (Exception e) {
	 
    }
  }
}
