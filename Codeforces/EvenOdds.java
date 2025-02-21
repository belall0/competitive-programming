package Codeforces;
/*
 * url: https://vjudge.net/solution/58423517/Cq4LOMGmqmIPjLFxEPWs
 * date: 17 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: I divided the problem into two subproblems. if K is a position of an odd number, then the Kth odd number is 2*K-1. If K is a position of an even number, then we need to subtract (N+1)/2 from K to remove the odd numbers and then multiply K by 2 to get the Kth even number.
 */

import java.util.Scanner;

public class EvenOdds {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long N, K;
    N = sc.nextLong();
    K = sc.nextLong();

    // If K is less than or equal to (N+1)/2, then the Kth number is odd.
    if (K <= (N + 1) / 2) {

      // to get the Kth odd number, we need to multiply K by 2 and subtract 1.
      System.out.println(2 * K - 1);
    } else {
      // If K is greater than (N+1)/2, then the Kth number is even.
      K -= (N + 1) / 2;

      // to get the Kth even number, we need to multiply K by 2.
      System.out.println(K * 2);
    }

    sc.close();
  }

}
