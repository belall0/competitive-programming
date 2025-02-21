package AtCoder;
/*
 * url: https://vjudge.net/solution/58401166/NR7IJVIK7XgObNeKpTK0
 * date: 16 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: Just implementation of the problem statement.
 */

import java.util.Scanner;

public class Box {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N, A, B;
    N = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();

    System.out.println(N - A + B);

    sc.close();
  }
}