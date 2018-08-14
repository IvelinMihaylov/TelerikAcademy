package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kitty {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    char[] path = in.readLine().toCharArray();
    String[] moving = in.readLine().split(" ");
    
    boolean lock = true;
    int position = 0;
    int previous = 0;
    int mov = 0;
    int soul = 0; //@ even
    int food = 0; //* odd
    int dead = 0; //x
    if(path[position] == 'x') {
	 System.out.println("You are deadlocked, you greedy kitty!\n" +
		    "Jumps before deadlock: " + position);
    } else {
	 
	 if(path[position] == '@') {
	   soul++;
	 } else if(path[position] == '*') {
	   food++;
	 }
	 path[position] = ' ';
	 
	 //Step 1
	 
	 for(int i = 0; i < moving.length; i++) {
	   mov = Integer.parseInt(moving[i]);
	   if(mov < 0) {
		
		int check = position + mov;
		position = check % path.length;
		if(position < 0) {
		  position += path.length;
		}
	   } else {
		
		position = (int) ((position + mov) % path.length);
		
	   }
	   previous++;
	   //Step 2
	   
	   if(path[position] == 'x') {
		
		if(position % 2 == 0) {
		  soul--;
		  path[position] = '@';
		} else {
		  food--;
		  path[position] = '*';
		}
		dead++;
		if(soul < 0 || food < 0) {
		  System.out.println("You are deadlocked, you greedy kitty!\n" +
				"Jumps before deadlock: " + previous);
		  i = moving.length;
		  lock = false;
		}
	   } else if(path[position] == '@') {
		soul++;
		path[position] = ' ';
	   } else if(path[position] == '*') {
		food++;
		path[position] = ' ';
		
	   }
	 }
	 if(lock) {
	   System.out.println("Coder souls collected: " + soul);
	   System.out.println("Food collected: " + food);
	   System.out.println("Deadlocks: " + dead);
	 }
    }
  }
}
