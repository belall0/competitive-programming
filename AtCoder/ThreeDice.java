package AtCoder;
/*
 * url: https://vjudge.net/solution/58379236/rOzhyXYZ6eyKLfjmJ5Z4
 * date: 15 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: Given 3 numbers on the top faces (a,b,c), the sum of the numbers on the bottom faces is [21 - (a+b+c)], since the sum of the opposite faces is 7.
 */

import java.util.Scanner;

public class ThreeDice {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b, c;
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();

    System.out.println(21 - (a + b + c));

    scanner.close();
  }

}
