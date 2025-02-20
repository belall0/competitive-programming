/*
 * url: https://vjudge.net/solution/58484057/nFMe0tiB2o0fgx8If9uV
 * date: 19 - 02 - 2025
 * category: brute force
 * complexity: O(n)
 * appproach: we simulate the process of growing up of the two brothers by multiplying the weight of each brother by 3 and 2 respectively until the weight of the first brother is greater than the weight of the second brother and we count the number of years it took to reach this condition.
 */

import java.util.Scanner;

public class BearandBigBrother {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int years = 0;

    while (a <= b) {
      a *= 3;
      b *= 2;
      years++;
    }

    System.out.println(years);

    sc.close();
  }

}
