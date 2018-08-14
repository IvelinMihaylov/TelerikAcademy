package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ring {
  
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] nk = in.readLine().split(" ");
    int n = Integer.parseInt(nk[0]);
    int k = Integer.parseInt(nk[1]);
    int[] ring = new int[n];
    for(int i = 0; i < n; i++) {
	 ring[i] = Integer.parseInt(in.readLine());
    }
    int index = 0;
    index += k;
    index %= ring.length;
    int count = ring.length - 1;
    int currentIndex = ring[index];
    ring[index] = 0;
    
    while(count != 1) {
	 index += currentIndex;
	 index %= ring.length;
	 currentIndex = ring[index]+1;
	 ring[index] = 0;
	 count--;
    }
    for(int i = 0; i < ring.length; i++) {
	 if(ring[i] != 0){
	   System.out.println(i+1);
	   
	 }
    }
  }
}
