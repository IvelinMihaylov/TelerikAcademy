package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MathExpression {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    double n = Double.parseDouble(in.readLine());
    double m = Double.parseDouble(in.readLine());
    double p = Double.parseDouble(in.readLine());
    double nominator = n * n + 1 / (m * p) + 1337;
    double denominator = n - 128.523123123 * p;
    double sin = Math.sin((int) m % 180);
    NumberFormat formatter = new DecimalFormat("#0.000000");
    System.out.println(formatter.format(nominator/denominator+sin));
  }
}
