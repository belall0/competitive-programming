package Codeforces;
/*
 * url: https://vjudge.net/solution/58452495/oPNP9bmozYUuMu1yDWqH
 * date: 18 - 02 - 2025
 * category: implementation
 * complexity: O(1)
 * appproach: each room can be occupied by q people, and p people are already there, the problem is to count how many rooms can take more 2 people
 * 
 * we need to count the number of rooms that satisfy the condition q - p >= 2
 */

import java.util.Scanner;

public class GeorgeandAccommodation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int cnt = 0;
    while (n-- != 0) {
      int p = sc.nextInt();
      int q = sc.nextInt();

      if (q - p >= 2) {
        cnt++;
      }
    }

    System.out.println(cnt);

    sc.close();
  }

}
