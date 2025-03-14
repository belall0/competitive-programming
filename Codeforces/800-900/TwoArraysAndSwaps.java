package Codeforces;
/*
 * url: https://vjudge.net/solution/58579834/YGv9WF7A9OSQWyL2iZyO
 * date: 22 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: sience he need to get the maximum sum of numbers in one array and you can swap k times,
 * we can sort both arrays, a ascending and b descending, so we make sure the first element in a is the smallest one and the first element in b is the largest one and keep swapping
 * 
 * i implemented this idea in two ways, first i used data structures approach to achieve what i want, this was straight forward and easy to implement sience i just inserting and removing elements from the data structures
 * 
 * the second approach was to sort the arrays and then swap the elements, this was a little bit tricky because i had to use arrays instead of data structures, so i had to sort the arrays and then swap the elements but there was an edge case i didn't consider which is if the element in a is greater than the element in b, i should break the loop and not swap the elements when using data structures i didn't have to worry about this because i was just removing and adding elements to the data structures
 */

import java.util.*;

public class TwoArraysAndSwaps {
  public static void main(String[] args) {
  }

  public static void solution_1() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      PriorityQueue<Integer> a = new PriorityQueue<>();
      PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());

      for (int i = 0; i < n; i++) {
        a.add(sc.nextInt());
      }

      for (int i = 0; i < n; i++) {
        b.add(sc.nextInt());
      }

      while (k-- > 0) {
        b.add(a.peek());
        a.add(b.peek());
        a.poll();
        b.poll();
      }

      int res = 0;
      for (int i : a) {
        res += i;
      }

      System.out.println(res);
    }

    sc.close();

  }

  public static void solution_2() {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {

      int n = sc.nextInt();
      int k = sc.nextInt();

      Integer[] a = new Integer[n];
      Integer[] b = new Integer[n];

      for (int i = 0; i < n; i++)
        a[i] = sc.nextInt();

      for (int i = 0; i < n; i++)
        b[i] = sc.nextInt();

      Arrays.sort(a);
      Arrays.sort(b, Collections.reverseOrder());

      for (int i = 0; i < k; i++) {

        if (a[i] >= b[i]) {
          break;
        }

        a[i] = b[i];
      }

      int res = 0;
      for (int i : a)
        res += i;

      System.out.println(res);

    }

    sc.close();
  }

}
