/*
 * url: https://vjudge.net/solution/58401395/HcApxVStFOpLbEJMljjG
 * date: 16 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: every 100 ml of a drink contains A Kcal, so B ml of the drink contains A * B / 100 Kcal
 */

import java.util.Scanner;

public class Kcal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double A, B;
    A = sc.nextDouble();
    B = sc.nextDouble();

    System.out.println(A * B / 100);

    sc.close();
  }

}
