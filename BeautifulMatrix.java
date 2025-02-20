/*
 * url: https://vjudge.net/solution/58483814/DTWKmaNA7hs6MVVmHFQC
 * date: 19 - 02 - 2025
 * category: implementation
 * complexity: O(1) because the matrix is always 5x5
 * appproach: while every row or column swaping is 1, so we can simulate the swapping process by getting the absolute difference between the current position and the center of the matrix
 */

import java.util.Scanner;

public class BeautifulMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int row = 1; row <= 5; row++) {
      for (int col = 1; col <= 5; col++) {
        int num = sc.nextInt();
        if (num == 1) {
          System.out.println(Math.abs(3 - row) + Math.abs(3 - col));
          sc.close();
          return;
        }
      }
    }

    sc.close();
  }

}
