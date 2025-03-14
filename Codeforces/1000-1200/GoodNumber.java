package Codeforces;
/*
 * url: https://vjudge.net/solution/58633633/9CSXAgFw7Yr8iyJWFZDN
 * date: 24 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: for each number check if it contains all the digits from 0 to k
 */

import java.util.Scanner;

public class GoodNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    sc.nextLine();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= k; i++) {
      sb.append(i);
    }

    int count = 0;
    for (int i = 0; i < n; i++) {
      String num = sc.nextLine();

      boolean isGood = true;
      for (int j = 0; j < sb.length(); j++) {
        if (num.contains(sb.substring(j, j + 1)) == false) {
          isGood = false;
          break;
        }
      }
      if (isGood)
        count++;
    }

    System.out.println(count);
    sc.close();
  }

}
