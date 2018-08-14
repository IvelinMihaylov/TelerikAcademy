package Arrays.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpellCaster {
  public static void main(String[] args) {
    try {
	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 
	 String[] word = in.readLine().split(" ");
	 StringBuilder firstStep = new StringBuilder();
	 boolean notEmpty = true;
	 while (notEmpty) {
	   notEmpty = false;
	   for (int i = 0; i < word.length; i++) {
		if (!(word[i].equals(""))) {
		  firstStep.append(word[i].substring(word[i].length() - 1, word[i].length()));
		  word[i] = word[i].substring(0, word[i].length() - 1);
		  notEmpty = true;
		}
	   }
	 }
	 
	 String aplhabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 for (int i = 0; i < firstStep.length(); i++) {
	   int index = aplhabet.indexOf(firstStep.toString().toUpperCase().charAt(i));
	   index += i + 1;
	   while (index >= firstStep.length()) {
		index -= firstStep.length();
	   }
	   
	   String character = firstStep.substring(i, i + 1);
	   firstStep = firstStep.deleteCharAt(i);
	   firstStep = firstStep.insert(index, character);
	 }
	 System.out.println(firstStep);
    } catch (
		  Exception e)
    
    {
	 
    }
  }
}
