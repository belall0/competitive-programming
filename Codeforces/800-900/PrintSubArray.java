package Codeforces;
/*
 * url: https://vjudge.net/solution/58514042/butF2hoSEDWQG3OjKSsJ
 * date: 20 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: just simple implementation
 */

import java.util.Scanner;

public class PrintSubArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n + 1];
    for (int i = 1; i <= n; i++)
      arr[i] = sc.nextInt();

    int l = sc.nextInt(), r = sc.nextInt();
    while (l <= r)
      System.out.print(arr[l++] + " ");

    sc.close();

  }

}
