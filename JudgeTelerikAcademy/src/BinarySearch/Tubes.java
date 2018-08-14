package BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tubes {
//  public static int binarySearch(int from, int to, int parts) {
//    int count = 0;
//    for(int i = 0; i < materials.length; i++) {
//      int material = materials[i];
//	 while(material>=to){
//	   material-=to;
//	   count++;
//	 }
//	 if(count == parts){
//	   binarySearch(to,to*2,parts);
//	 }
//
//    }
//  }
  
  public static int[] materials;
  
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int m = Integer.parseInt(in.readLine());
    materials = new int[n];
    int bigTubes = 0;
    for(int i = 0; i < materials.length; i++) {
	 materials[i] = Integer.parseInt(in.readLine());
	 if(bigTubes < materials[i]) {
	   bigTubes = materials[i];
	 }
    }
//    binarySearch(0, bigTubes,m);
  }
}