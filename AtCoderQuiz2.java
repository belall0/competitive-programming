/*
 * url: https://vjudge.net/solution/58434051/dMsCG4QHZgtGxn7XJs0f
 * date: 17 - 02 - 2025
 * category: implementation
 * complexity: O(1)
 * appproach: to find the minimum number of points needed to reach the next level, just subtract the current points from the next level points
 */

import java.util.Scanner;

public class AtCoderQuiz2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();

    if (x < 40) {
      System.out.println(40 - x);
    } else if (x < 70) {
      System.out.println(70 - x);
    } else if (x < 90) {
      System.out.println(90 - x);
    } else {
      System.out.println("expert");
    }

    sc.close();

  }

}
