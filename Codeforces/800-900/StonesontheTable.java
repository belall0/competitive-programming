package Codeforces;

/*
 * url: https://vjudge.net/solution/58633195/pqmKS3mMPAp7OEVG2TYH
 * date: 24 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: we need to find the minimum number of stones to remove to make any two adjacent stones have different colors. so after abstracting the problem we can define it as we need to check every to consecutive stones and check if they are the same color or not
 * 
 * instead of getting our hands dirty with indexes, i used a stack to keep track of how many stones we need to remove, then subtract the total number of stones from the size of the stack
 */
import java.util.*;

public class StonesontheTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String s = sc.nextLine();
    Stack<Character> stk = new Stack<>();
    stk.add(s.charAt(0));

    for (int i = 1; i < n; i++) {
      if (stk.peek() != s.charAt(i)) {
        stk.add(s.charAt(i));
      }
    }

    System.out.println(n - stk.size());

    sc.close();
  }
}
