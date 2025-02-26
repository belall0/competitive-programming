package Codeforces;
/*
 * url: https://vjudge.net/solution/58659635/xTBwTu5Yh884IDobRrqu
 * date: 25 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: to make sure every converted digit is the smallest possible, we need to check if the digit is greater than or equal to 5
 */

import java.util.*;

public class ChewbaсcaandNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringBuilder x = new StringBuilder(sc.nextLine());
    for (int i = 0; i < x.length(); i++) {
      int digit = Character.getNumericValue(x.charAt(i));
      if (5 <= digit) {
        digit = 9 - digit;

        // handle leading zeros case
        if (i == 0 && digit == 0) {
          continue;
        }

        x.replace(i, i + 1, digit + "");
      }
    }

    System.out.println(x);

    sc.close();
  }

}
