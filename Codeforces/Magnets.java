package Codeforces;
/*
 * url: https://vjudge.net/solution/58605494/io7sDt6oJZIAFfi2G4G6
 * date: 23 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: 
 * We can iterate over the magnets and check if the current magnet has the same polarity as the previous one. If it does, we increment the number of groups.
 */

import java.util.*;

public class Magnets {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    String prev = sc.nextLine();
    int groups = 1;
    n--;

    while (n-- > 0) {
      String current = sc.nextLine();
      if (prev.charAt(1) != current.charAt(0)) {
        prev = current;
        continue;
      }

      prev = current;
      groups++;
    }

    System.out.println(groups);

    sc.close();

  }

}