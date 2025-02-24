package Codeforces;

/*
 * url: https://vjudge.net/solution/58605703/tR79KnAAF1CiZX1FfyDz
 * date: 23 - 02 - 2025
 * category: strings
 * complexity: O(1)
 * appproach: just capitalize the first letter of the string
 */

import java.util.*;

public class WordCapitalization {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));

    sc.close();

  }

}
