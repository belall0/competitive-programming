package AtCoder;
/*
 * url: https://vjudge.net/solution/58401331/V6LLTtD6JMiVdqlk7kl6
 * date: 16 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: Calculate the mean arterial pressure using the formula (A - B) / 3 + B.
 */

import java.util.Scanner;

public class BloodPressure {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double A, B;
    A = sc.nextDouble();
    B = sc.nextDouble();

    System.out.println((A - B) / 3 + B);

    sc.close();
  }
}
