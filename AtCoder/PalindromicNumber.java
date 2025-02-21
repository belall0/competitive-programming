package AtCoder;
/*
 * url: https://vjudge.net/solution/58423650/PUhZOEnt2a3ygjpSdYOp
 * date: 17 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: to check if a 3 digit number is palindromic or not, we need to check if the first and last digit are same or not.
 */

import java.util.Scanner;

public class PalindromicNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int digit3 = N % 10;
    N /= 100;
    int digit1 = N % 10;

    if (digit1 == digit3) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();

  }

}
