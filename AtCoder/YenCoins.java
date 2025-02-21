package AtCoder;
/*
 * url: https://vjudge.net/solution/58424246/qjbzupRDXzzZvb7i9C98
 * date: 17 - 02 - 2025
 * category: implementation
 * complexity: O(1)
 * appproach: check if k 500-yen coins are up to x yen
 */

import java.util.Scanner;

public class YenCoins {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int K, X;
    K = sc.nextInt();
    X = sc.nextInt();

    System.out.println((K * 500 >= X) ? "Yes" : "No");

    sc.close();
  }

}
