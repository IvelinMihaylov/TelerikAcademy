package Conditionals.easy;

import java.math.BigDecimal;
import java.util.Scanner;

public class CartesianCoordinates {
  public static void main(String[] args) {
    try {
	 Scanner in = new Scanner(System.in);
	 BigDecimal x = in.nextBigDecimal();
	 BigDecimal y = in.nextBigDecimal();
	 
	 if (x.compareTo(BigDecimal.ZERO) == 0 && y.compareTo(BigDecimal.ZERO) == 0)
	   System.out.println(0);
	 else if(x.compareTo(BigDecimal.ZERO) > 0 && y.compareTo(BigDecimal.ZERO) > 0)
	   System.out.println(1);
	 else if(x.compareTo(BigDecimal.ZERO) < 0 && y.compareTo(BigDecimal.ZERO) > 0)
	   System.out.println(2);
	 else if (x.compareTo(BigDecimal.ZERO) < 0 && y.compareTo(BigDecimal.ZERO) < 0)
	   System.out.println(3);
	 else if(x.compareTo(BigDecimal.ZERO) > 0 && y.compareTo(BigDecimal.ZERO) < 0)
	   System.out.println(4);
	 else if(x.compareTo(BigDecimal.ZERO) == 0 && y.compareTo(BigDecimal.ZERO) > 0 ||
		    x.compareTo(BigDecimal.ZERO) == 0 && y.compareTo(BigDecimal.ZERO) < 0)
	   System.out.println(5);
	 else if(x.compareTo(BigDecimal.ZERO) > 0 && y.compareTo(BigDecimal.ZERO) == 0 ||
		    x.compareTo(BigDecimal.ZERO) < 0 && y.compareTo(BigDecimal.ZERO) == 0)
	   System.out.println(6);
    } catch (Exception e) {
	 
    }
  }
}
