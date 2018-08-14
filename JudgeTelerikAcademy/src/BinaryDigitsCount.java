import java.util.Scanner;

public class BinaryDigitsCount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int b = scanner.nextInt();
    if(b == 1)
	 b = 0;
    else
	 b = 1;
    int n = scanner.nextInt();
    String[] array = new String[n];
    
    for(int i = 0; i < n; i++) {
	 array[i] = Long.toBinaryString(scanner.nextLong());
	 array[i] = array[i].replace(String.valueOf(b), "");
    }
    for(int i = 0; i < array.length; i++) {
	 if(array[i].length() == 0 && b == 0)
	   System.out.println(1);
	 else if(array[i].length() == 0 && b == 1)
	   System.out.println(0);
	 else
	   System.out.println(array[i].length());
    }
  }
}
