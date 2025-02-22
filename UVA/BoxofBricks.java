package UVA;

/*
 * url: https://vjudge.net/solution/58545053/2fEzEFwPHFv9d9185lMg
 * date: 21 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach:
 * The first idea that comes to my mind is to sort the array and start simulating the process of moving the bricks using two pointers. regardless of the complexity of this solution and the high possibility of doing something wrong when manipulating the pointers, There's a better and simpler solution which is to calculate the final height of the bricks and then iterate over the array and calculate the number of moves needed to make all exceeding stacks equal to the final height.
 * 
 * you don't have to simulate the process of moving the bricks from bigger stacks to smaller ones, you just need to calculate the final value
 * 
 * Lesson: be lazy and always try to do what is enough to solve the problem
 */
import java.util.*;

public class BoxofBricks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sets = 1;
    while (true) {
      int n = sc.nextInt();
      if (n == 0)
        break;

      int[] h = new int[n];
      int total_bricks = 0;
      for (int i = 0; i < n; i++) {
        h[i] = sc.nextInt();
        total_bricks += h[i];
      }

      int target_height = total_bricks / n;
      int moves = 0;

      for (int i : h)
        if (i > target_height)
          moves += i - target_height;

      System.out.println("Set #" + sets++);
      System.out.println("The minimum number of moves is " + moves + ".");
      System.out.println();
    }

    sc.close();
  }
}
