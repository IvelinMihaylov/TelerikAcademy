package Loops.Easy;

import java.util.Scanner;

public class PaperCutter {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int n = scanner.nextInt();
	   
	   if(1024 <= n)
		  n -= 1024;
	   else
		  System.out.println("A0");
	   
	   if(512 <= n)
		  n -= 512;
	   else
		  System.out.println("A1");
	   
	   if(256 <= n)
		  n -= 256;
	   else
		  System.out.println("A2");
	   
	   if(128 <= n)
		  n -= 128;
	   
	   else
		  System.out.println("A3");
	   
	   if(64 <= n)
		  n -= 64;
	   else
		  System.out.println("A4");
	   
	   if(32 <= n)
		  n -= 32;
	   else
		  System.out.println("A5");
	   
	   if(16 <= n)
		  n -= 16;
	   else
		  System.out.println("A6");
	   
	   if(8 <= n)
		  n -= 8;
	   else
		  System.out.println("A7");
	   
	   if(4 <= n)
		  n -= 4;
	   else
		  System.out.println("A8");
	   
	   if(2 <= n)
		  n -= 2;
	   else
		  System.out.println("A9");
	   
	   if(1 <= n)
		  n -= 1;
	   else
		  System.out.println("A10");
	   
    }
}
