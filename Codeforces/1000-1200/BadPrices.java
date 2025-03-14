package Codeforces;

/*
 * url: https://vjudge.net/solution/58545605/GU0q5n1fhn5fwh2qG9mF
 * date: 21 - 02 - 2025
 * category: greedy, data structure
 * complexity: O(n)
 * appproach: the core idea of the problem is for each element i we need to find if there is any element before i that is greater than the current and not considered before. and if found increment the counter.
 * 
 * the naive approach: O(n^2)
 * loop from i = 0 to n - 1, and for each element loop from j = i + 1 to n - 1, and search for any number that is less than the current element. if found increment the counter and break the loop.
 * 
 * the optimal approach: O(n) [using data structure "My approach"]
 * in this solution i used reversed priority queue to keep track of greater numbers before each i
 * 
 * the optional appraoch: O(n) [using array]
 * just loop from i = n - 1 to 0, and keep track of the minimum number from the right side of the array, and if the current element is greater than the minimum increment the counter.
 */

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BadPrices {
  public static void solution_1() {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();

      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      int cnt = 0;

      for (int i = 0; i < n; i++) {
        int num = sc.nextInt();

        while (!pq.isEmpty()) {
          int max_num = pq.peek();

          if (max_num > num) {
            cnt++;
            pq.poll(); // remove the max_num
          } else {
            break;
          }
        }

        pq.add(num);
      }
      System.out.println(cnt);
    }

    sc.close();
  }

  public static void solution_2() {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = sc.nextInt();

      int min = a[n - 1];
      int cnt = 0;
      for (int i = n - 1; i >= 0; i--) {
        if (a[i] > min) {
          cnt++;
        } else if (a[i] < min) {
          min = a[i];
        }
      }

      System.out.println(cnt);
    }

    sc.close();
  }

  public static void main(String[] args) {
    solution_1();
  }
}
