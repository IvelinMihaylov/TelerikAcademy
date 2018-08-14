import java.util.Scanner;

public class Ranks {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] number = new int[n];
    for (int i = 0 ; i < n ; i++)
    {
	 number[i] = scanner.nextInt();
    }
    int rang = 1;
    for (int i = 0 ; i < n ; i++) {
	 for (int j = 0; j < n; j++) {
	   if (number[i] < number[j]) {
		rang++;
	   }
	 }
	 System.out.print(rang + " ");
	 rang = 1;
    }
  }
}
