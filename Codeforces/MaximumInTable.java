package Codeforces;
/*
 * url: https://vjudge.net/solution/58514616/slAYUbLYKT7sZcGN1Mum
 * date: 20 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: just simple implementation
 */

import java.util.Scanner;

public class MaximumInTable {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] arr = new int[11][11];
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++)
      arr[1][i] = arr[i][1] = 1;

    for (int row = 2; row <= n; row++)
      for (int col = 2; col <= n; col++)
        arr[row][col] = arr[row - 1][col] + arr[row][col - 1];

    System.out.println(arr[n][n]);

    sc.close();
  }

}
