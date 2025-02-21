package AtCoder;
/*
 * url: https://vjudge.net/solution/58378867/SRIRk7moR2V70nrkWfpq
 * date: 15 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: M is the time (24-hour notation) on 30th December, to get the hours left until the new year, we just need to subtract M from 48.
 */

import java.util.Scanner;

public class NewYear {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int M;
    M = scanner.nextInt();
    System.out.println(48 - M);

    scanner.close();
  }

}
