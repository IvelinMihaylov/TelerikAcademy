package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShipDamage {
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int sx1 = Integer.parseInt(in.readLine());
	   int sy1 = Integer.parseInt(in.readLine());
	   
	   int sx2 = Integer.parseInt(in.readLine());
	   int sy2 = Integer.parseInt(in.readLine());
	   
	   int h = Integer.parseInt(in.readLine());
	   
	   int cx1 = Integer.parseInt(in.readLine());
	   int cy1 = Integer.parseInt(in.readLine());
	   
	   int cx2 = Integer.parseInt(in.readLine());
	   int cy2 = Integer.parseInt(in.readLine());
	   
	   int cx3 = Integer.parseInt(in.readLine());
	   int cy3 = Integer.parseInt(in.readLine());
	   
	   int sum = 0;
	   cy1 = 2 * h - cy1;
	   cy2 = 2 * h - cy2;
	   cy3 = 2 * h - cy3;
	   int maxX = Math.max(sx1, sx2);
	   int minX = Math.min(sx1, sx2);
	   int maxY = Math.max(sy1, sy2);
	   int minY = Math.min(sy1, sy2);
	   
	   sum += corner(cx1, cy1, maxX, maxY, minX, minY);
	   sum += border(cx1, cy1, maxX, maxY, minX, minY);
	   sum += atBody(cx1, cy1, maxX, maxY, minX, minY);
	   
	   sum += corner(cx2, cy2, maxX, maxY, minX, minY);
	   sum += border(cx2, cy2, maxX, maxY, minX, minY);
	   sum += atBody(cx2, cy2, maxX, maxY, minX, minY);
	   
	   sum += corner(cx3, cy3, maxX, maxY, minX, minY);
	   sum += border(cx3, cy3, maxX, maxY, minX, minY);
	   sum += atBody(cx3, cy3, maxX, maxY, minX, minY);
	   
	   System.out.println(sum + "%");
    }
    
    private static int corner(int row, int col, int maxX, int maxY, int minX, int minY) {
	   if((row == minX || row == maxX) && (col == minY || col == maxY)) {
		  return 25;
	   }
	   return 0;
    }
    
    private static int border(int row, int col, int maxX, int maxY, int minX, int minY) {
	   if(((row == minX || row == maxX) && (col > minY && col < maxY)) ||
		  ((col == minY || col == maxY) && (row > minX && row < maxX))) {
		  return 50;
	   }
	   return 0;
    }
    
    private static int atBody(int row, int col, int maxX, int maxY, int minX, int minY) {
	   if((row > minX) && (row < maxX) && (col > minY) && (col < maxY)) {
		  return 100;
	   }
	   return 0;
    }
}
