/*
 * url: https://vjudge.net/solution/58451967/PF65V1VaKNIonQMBevHC
 * date: 18 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: the children are arranged in a row and the candies are distributed in such a way that the first child gets 1 candy, the second child gets 2 candies, the third child gets 3 candies and so on. The task is to find the total number of candies needed to distribute to all the children.
 * when we abstract the problem, we just need to find the sum of the first n natural numbers.
 * just use the formula n * (n + 1) / 2
 */

import java.util.Scanner;

public class ChildrenandCandies {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println(n * (n + 1) / 2);

    sc.close();
  }
}
