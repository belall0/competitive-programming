package Codeforces;
/*
 * url: https://vjudge.net/solution/58483115/SD9KU0oYripb3U0RJdaY
 * date: 19 - 02 - 2025
 * category: Brute Force
 * complexity: O(n)
 * appproach: the number is called almost lucky if it is divisible by a lucky number.
 * and a lucky number is a number that contains only 4 and 7.
 * so, we can check all the numbers from 4 to n and check if the number is lucky and n is divisible by that number.
 */

import java.util.Scanner;

public class LuckyDivision {

  public static boolean isLucky(int num) {
    boolean isLucky = true;

    while (num > 0) {
      int digit = num % 10;

      if (digit != 4 && digit != 7) {
        isLucky = false;
        break;
      }

      num /= 10;
    }

    return isLucky;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    boolean isAlmostLucky = false;
    for (int i = 4; i <= n; i++) {
      if (isLucky(i) && n % i == 0) {
        isAlmostLucky = true;
        break;
      }
    }

    System.out.println(isAlmostLucky ? "YES" : "NO");

    sc.close();
  }

}
