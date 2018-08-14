package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThreeGroups {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    String[] arr = in.readLine().split(" ");
    
    ArrayList<Integer> firstsGroup = new ArrayList<>();
    ArrayList<Integer> secondsGroup = new ArrayList<>();
    ArrayList<Integer> thirdsGroup = new ArrayList<>();
    
    for(int i = 0; i < arr.length; i++) {
	 if(Integer.parseInt(arr[i]) % 3 == 0) {
	   firstsGroup.add(Integer.parseInt(arr[i]));
	 } else if(Integer.parseInt(arr[i]) % 3 == 1) {
	   secondsGroup.add(Integer.parseInt(arr[i]));
	 } else if(Integer.parseInt(arr[i]) % 3 == 2) {
	   thirdsGroup.add(Integer.parseInt(arr[i]));
	 }
    }
    for(Integer x : firstsGroup) {
	 System.out.print(x + " ");
    }
    System.out.println();
    for(Integer x : secondsGroup) {
	 System.out.print(x + " ");
    }
    System.out.println();
    for(Integer x : thirdsGroup) {
	 System.out.print(x + " ");
    }
    System.out.println();
  }
}
