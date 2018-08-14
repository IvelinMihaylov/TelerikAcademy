package Conditionals.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Numbers {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 StringBuilder number = new StringBuilder();
	 boolean isWork = true;
	 while(isWork) {
	   String[] command = in.readLine().split(" ");
	   switch(command[0]) {
		case "set":
		  number = new StringBuilder(command[1]);
		  break;
		case "front-add":
		  number = number.insert(0, command[1]);
		  break;
		case "front-remove":
		  if(number.length() > 0)
		    number = number.deleteCharAt(0);
		  break;
		case "back-add":
		  number = number.insert(number.length(), command[1]);
		  break;
		case "back-remove":
		  if(number.length() > 0)
		    number = number.deleteCharAt(number.length() - 1);
		  break;
		case "reverse":
		  number = number.reverse();
		  break;
		case "print":
		  System.out.println(number);
		  break;
		case "end":
		default:
		  isWork = false;
		  break;
	   }
	 }
	 
    } catch (Exception e) {
	 
    }
  }
}
