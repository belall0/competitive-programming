package AtCoder;
/*
 * url: https://vjudge.net/solution/58377959/Yl9tIPlGhRBbpq3Z4uw5
 * date: 15 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: N is the number of Kilograms the truck can carry, K is the weight of each brick, so to get At most how many bricks can be loaded into the truck, we just need to divide N by K.
 */

import java.util.Scanner;

public class Brick {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N, K;
    N = scanner.nextInt();
    K = scanner.nextInt();
    System.out.println(N / K);

    scanner.close();
  }
}
