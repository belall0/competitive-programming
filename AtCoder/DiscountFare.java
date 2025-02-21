package AtCoder;
/*
 * url: https://vjudge.net/solution/58401236/mZpp5DN11nzUZlRs78YS
 * date: 16 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: the normal fare is X + Y, but the discount fare is (X + Y / 2)
 */

import java.util.Scanner;

public class DiscountFare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int X, Y;
    X = sc.nextInt();
    Y = sc.nextInt();

    System.out.println(X + Y / 2);

    sc.close();
  }

}
