/*
 * url: https://vjudge.net/solution/58401586/AS9muLysA2n12Qk5eoc7
 * date: 16 - 02 - 2025
 * category: implementation math
 * complexity: O(1)
 * appproach: 
 * 1. determine the time it takes for the spells to meet initially: length / (speed1 + speed2)
 * 2. determine the distance the first speel has traveled: time * speed1
 */

import java.util.Scanner;

public class WizardDuel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double L, P, Q;
    L = sc.nextDouble();
    P = sc.nextDouble();
    Q = sc.nextDouble();

    double time = L / (P + Q);
    double distance = time * P;

    System.out.println(distance);

    sc.close();
  }
}
