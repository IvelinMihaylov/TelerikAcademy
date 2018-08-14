package Loops.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Devide {
  
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long[] input = Arrays.stream(in.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    long m, n, nod, br;
    m = input[0];
    n = input[1];
    for(int i = 0; m != n; i++) {
	 if(m > n) {
	   m = m - n;
	 } else {
	   n = n - m;
	 }
    }
    nod = m;
    if(nod == 1) {
	 System.out.print(-1 + " ");
    }
    for(int i = 2; i <= nod; i++) {
	 br = 0;
	 while(true) {
	   if(nod % i == 0) {
		br++;
		nod = nod / i;
	   }else {
	     break;
	   }
	 }
	 if(br!=0){
	   System.out.print(i + " ");
	 }
    }
  }
}
