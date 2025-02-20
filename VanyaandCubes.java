/*
 * url: https://vjudge.net/solution/58484717/pQr8ILmKrCCrkhAx0TsE
 * date: 19 - 02 - 2025
 * category: 
 * complexity: 
 * appproach:
 */

import java.util.Scanner;

public class VanyaandCubes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int level = 0;
    while (n > 0) {
      level++;
      int value = (level * (level + 1)) / 2;
      n -= value;
      if (n < 0) {
        level--;
      }
    }

    System.out.println(level);

    sc.close();
  }

}
