package Codeforces;
/*
 * url: https://vjudge.net/solution/58633077/JVjFPq1AW5aRFtnLvYWD
 * date: 24 - 02 - 2025
 * category: data structure
 * complexity: O(n)
 * appproach: use a set to store the unique characters and then print the size of the set
 */

import java.util.*;

public class AntonandLetters {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    Set<Character> st = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
        st.add(s.charAt(i));
      }
    }

    System.out.println(st.size());

    sc.close();
  }
}
