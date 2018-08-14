package InputOutput;

import java.util.Scanner;

public class SayHello {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello, " + scanner.next() + "!");
  }
}
