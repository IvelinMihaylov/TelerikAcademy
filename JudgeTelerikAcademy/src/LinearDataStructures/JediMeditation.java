package LinearDataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JediMeditation {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    in.readLine();
    String[] jedis = in.readLine().split(" ");
    StringBuilder result = new StringBuilder();
    int m = 0;
    int k = 0;
    
    for(int i = 0; i < jedis.length; i++) {
	 if(jedis[i].charAt(0) == 'M') {
	   result.insert(m, jedis[i] + " ");
	   m+=jedis[i].length()+1;
	 }
	 if(jedis[i].charAt(0) == 'K'){
	   result.insert(m+k, jedis[i] + " ");
	   k+=jedis[i].length()+1;
	 }
	   if(jedis[i].charAt(0) == 'P'){
	   result.append(jedis[i] + " ");
	   }
    }
    System.out.println(result);
  }
}