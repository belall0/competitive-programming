package Codeforces;
/*
 * url: https://vjudge.net/solution/58605843/uHXZzgZgTklX8sDqvvBE
 * date: 23 - 02 - 2025
 * category: strings
 * complexity: O(n)
 * appproach: just implement the solution
 */

import java.util.*;

public class ShortSubstrings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {

      String b = sc.next();
      String res = b.charAt(0) + "";
      for (int i = 1; i < b.length(); i += 2) {
        res += b.charAt(i);
      }

      System.out.println(res);
    }

    sc.close();

  }

}
