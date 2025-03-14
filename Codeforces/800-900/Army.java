package Codeforces;
/*
 * url: https://vjudge.net/solution/58544269/CFr7R3NLVhzS8Fy8BAvm
 * date: 21 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: you just need to sum between d[a] to d[b-1] inclusive to get the answer
 */

import java.util.Scanner;

public class Army {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] d = new int[n];
    for (int i = 1; i < n; i++) {
      d[i] = sc.nextInt();
    }

    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = 0;
    while (a < b) {
      ans += d[a++];
    }

    System.out.println(ans);

    sc.close();
  }
}