/*
 * url: https://vjudge.net/solution/58451852/qGz2LB10UpbBYcoDZ0zF
 * date: 18 - 02 - 2025
 * category: Math
 * complexity: O(1)
 * appproach: you know the pitch speed and the time interval where the pitch is invisible, and you're given a distance and asked if the pitch is visible at that distance or not.
 * 1. calculate the time it takes for the pitch to reach the distance.
 * 2. if the time is within the invisible interval, then the pitch is invisible and the answer is "No".
 * 3. otherwise, the pitch is visible and the answer is "Yes".
 */

import java.util.Scanner;

public class VanishingPitch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int v, t, s, d;
    v = sc.nextInt();
    t = sc.nextInt();
    s = sc.nextInt();
    d = sc.nextInt();

    double currentTime = 1.0 * d / v;
    if (t <= currentTime && currentTime <= s) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }

    sc.close();
  }
}
