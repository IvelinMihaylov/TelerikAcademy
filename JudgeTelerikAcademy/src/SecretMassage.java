import java.util.Scanner;

public class SecretMassage {
    
    public static void main(String[] args) throws Exception {
	   Scanner in = new Scanner(System.in);
	   new StringBuilder(in.nextLine())
		  .reverse()
		  .chars()
		  .filter(x -> Character.isLetter(x))
		  .forEach(x -> System.out.print((char) x));
    }
}
