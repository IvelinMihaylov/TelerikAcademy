package Math;

import java.util.Scanner;

public class Tracker {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    
    int miles = scanner.nextInt();
    System.out.println(miles*1609);
  }
}
