package InputOutput;

import java.io.DataInputStream;
import java.io.IOException;

public class Trapezoid {
  public static void Trapezoid(int n) {
    System.out.println(new String(new char[n]).replace("\0", ".") +
		  new String(new char[n]).replace("\0", "*"));
    TrapezoidInsideBuilder(n,n);
    System.out.println(new String(new char[n * 2]).replace("\0", "*"));
  }
  public static void TrapezoidInsideBuilder(int n , int b){
    if (n==1)
	 return;
    System.out.println(new String(new char[n - 1]).replace("\0", ".")
		  + "*" + new String(new char[b - 1 ]).replace("\0", ".") + "*");
    TrapezoidInsideBuilder(n-1,b+1);
  }
  
  public static void main(String[] args) {
    try {
	 DataInputStream in = new DataInputStream(System.in);
	 int n = Integer.parseInt(in.readLine());
	 
	 Trapezoid(n);
	 
    } catch (IOException e) {
	 
    }
  }
}
