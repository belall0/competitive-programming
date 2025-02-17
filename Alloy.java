/*
 * url: https://vjudge.net/solution/58402162/Tvi5FTaFqzWyhVnRNGt5
 * date: 16 - 02 - 2025
 * category: Implementation
 * complexity: O(1)
 * appproach: since either A or B must be greater than 0, so if B is 0 then it is Gold, if A is 0 then it is Silver, otherwise it is Alloy
 */

import java.util.Scanner;

public class Alloy {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B;
    A = sc.nextInt();
    B = sc.nextInt();

    if (B == 0) {
      System.out.println("Gold");
    } else if (A == 0) {
      System.out.println("Silver");
    } else {
      System.out.println("Alloy");
    }

    sc.close();
  }
}
