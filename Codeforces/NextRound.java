package Codeforces;
/*
 * url: https://vjudge.net/solution/58605110/UZHq8EvZmOWxFE1YZec0
 * date: 21 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: you need to count the number of participants who have scored more than 0 and have scored more than or equal to the kth participant
 */

import java.util.*;

public class NextRound {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] scores = new int[n];

    for (int i = 0; i < n; i++) {
      scores[i] = sc.nextInt();
    }

    int kthScore = scores[k - 1];

    int count = 0;
    for (int i = 0; i < n; i++) {
      if (scores[i] > 0 && scores[i] >= kthScore) {
        count++;
      } else {
        break;
      }
    }

    System.out.println(count);

    sc.close();
  }

}
