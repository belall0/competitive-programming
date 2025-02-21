package Codeforces;
/*
 * url: https://vjudge.net/solution/58513708/O9qW7UFw3bD6VHTsP2IW
 * date: 20 - 02 - 2025
 * category: greedy
 * complexity: O(n)
 * appproach: every group of 4 people can take a taxi, then we can take a taxi for every group of 3 people with a group of 1 people, then we combine every group of 1 to make a group of 2, then all groups of 2 will combine to make a group of 4 and take a taxi.
 */

import java.util.Scanner;

public class Taxi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] freq = new int[5];

    while (n-- > 0)
      freq[sc.nextInt()]++;

    int res = freq[4] + freq[3];

    freq[1] -= freq[3];
    if (freq[1] > 0) {
      freq[2] += Math.ceil(freq[1] * 1.0 / 2);
    }

    res += Math.ceil(freq[2] * 1.0 / 2);
    System.out.println(res);

    sc.close();
  }

}
