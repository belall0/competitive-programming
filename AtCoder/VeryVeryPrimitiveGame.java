package AtCoder;
/*
 * url: https://vjudge.net/solution/58433704/tFcztIVHvgLiPyA1H1In
 * date: 17 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: the winner is determined based on two conditions:
 * 1. if a > b, Takahashi wins whatever the value of c is.
 * 2. if a < b, Aoki wins whatever the value of c is.
 * 3. if a == b, the winner is determined by the value of c. so the one who plays last wins.
 */

import java.util.Scanner;

public class VeryVeryPrimitiveGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if (a > b) {
      System.out.println("Takahashi");
    } else if (a < b) {
      System.out.println("Aoki");
    } else {
      if (c == 0) {
        System.out.println("Aoki");
      } else {
        System.out.println("Takahashi");
      }
    }

    sc.close();
  }
}
