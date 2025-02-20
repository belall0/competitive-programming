/*
 * url: https://vjudge.net/solution/58483538/EdgA3Q9ARRMvnTANAEVU
 * date: 19 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: count the number of 1s in each line and if it is greater than or equal to 2 then increment the result
 */

import java.util.Scanner;

public class Team {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    int res = 0;

    while (n-- > 0) {
      String[] line = sc.nextLine().split("");
      int count = 0;

      for (String s : line) {
        if (s.equals("1")) {
          count++;
        }
      }

      if (count >= 2) {
        res++;
      }
    }

    System.out.println(res);

    sc.close();
  }

}
