/*
 * url: https://vjudge.net/solution/58484408/q9DQNnVrhZv8iLUMRbw1
 * date: 19 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: just subtract the last digit of the number if it is not zero, otherwise divide the number by 10 and repeat the process k times 
 */

import java.util.Scanner;

public class WrongSubtraction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n, k;

    n = sc.nextInt();
    k = sc.nextInt();

    while (k-- > 0) {
      int lastDigit = n % 10;

      if (lastDigit == 0) {
        n /= 10;
      } else {
        n--;
      }
    }

    System.out.println(n);

    sc.close();

  }

}
