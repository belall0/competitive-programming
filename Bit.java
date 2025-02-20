/*
 * url: https://vjudge.net/solution/58483375/HfONDFza38Mimp5HX3om
 * date: 19 - 02 - 2025
 * category: Implementation
 * complexity: O(n)
 * appproach: check if the string contains ++ or -- and increment or decrement the value of x based on that
 */

import java.util.Scanner;

public class Bit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x = 0;
    n = Integer.parseInt(sc.nextLine());

    while (n-- != 0) {
      String str;
      str = sc.nextLine();
      if (str.contains("++")) {
        x++;
      } else {
        x--;
      }
    }

    System.out.println(x);

    sc.close();

  }
}
