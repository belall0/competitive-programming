package AtCoder;
/*
 * url: https://vjudge.net/solution/58423910/EasorXcif1e0fXxbfT9P
 * date: 17 - 02 - 2025
 * category: implementation
 * complexity: O(1)
 * appproach: to get how many days where month number as same as day number given a is the month number and b is the day number, if b is greater than or equal to a then the answer is a otherwise the answer is a - 1
 */

import java.util.Scanner;

public class DayofTakahashi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (b >= a) {
      System.out.println(a);
    } else {
      System.out.println(a - 1);
    }

    sc.close();

  }

}
