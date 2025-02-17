/*
 * url: https://vjudge.net/solution/58401763/2sKzuaO4YdMzOpTRbJfE
 * date: 16 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: if the weight is (1,2,3) or odd number then it is impossible to divide the watermelon into two even parts
 */

import java.util.Scanner;

public class Watermelon {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int w = sc.nextInt();
    if (w < 4 || w % 2 != 0) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }

    sc.close();
  }
}
