package Math;
//TODO : http://judge.telerikacademy.com/problem/l1p1naplazh
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OnTheBeach {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[] input = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int lonyMinuteArrive = input[0] * 60 + input[1];
    int lonyMinuteLeave = input[2] * 60 + input[3];
    
    int monyMinuteArrive = input[4] * 60 + input[5];
    int monyMinuteLeave = input[5] * 60 + input[7];
    
    if(lonyMinuteLeave < monyMinuteArrive || monyMinuteLeave < lonyMinuteArrive) {
	 System.out.println("No");
    } else {
	 if(monyMinuteArrive >= lonyMinuteArrive && monyMinuteArrive <= lonyMinuteLeave) {
	   if(monyMinuteLeave <= lonyMinuteLeave) {
		System.out.println(monyMinuteArrive / 60 + " " + monyMinuteArrive % 60 + " " + monyMinuteLeave / 60 + " " + monyMinuteLeave % 60);
	   } else {
		System.out.println(monyMinuteArrive / 60 + " " + monyMinuteArrive % 60 + " " + lonyMinuteLeave / 60 + " " + lonyMinuteLeave % 60);
	   }
	 } else {
	   if(monyMinuteLeave >= lonyMinuteArrive && monyMinuteLeave <= lonyMinuteArrive) {
		System.out.println(lonyMinuteArrive / 60 + " " + lonyMinuteArrive % 60 + " " + monyMinuteLeave / 60 + " " + monyMinuteLeave % 60);
	   } else {
		System.out.println(lonyMinuteArrive / 60 + " " + lonyMinuteArrive % 60 + " " + lonyMinuteLeave / 60 + " " + lonyMinuteLeave % 60);
	   }
	 }
    }
  }
}