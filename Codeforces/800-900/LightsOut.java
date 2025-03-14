package Codeforces;
/*
 * url#1 - my initial solution:  https://vjudge.net/solution/58591432/XQ1oDmFCWocYlLxm4RX6
 * url#2- optimized solution in terms of readability: https://vjudge.net/solution/58591673/44uIYaiuwSBwNJGmRYqU
 * date: 22 - 02 - 2025
 * category: implementation
 * complexity: O(n)
 * appproach: we just need to increment the current cell and its adjacent cells by the given value and then toggle the cells
 */

import java.util.Scanner;

public class LightsOut {

  // Constants for grid dimensions
  private static final int GRID_SIZE = 3;

  // Arrays defined for the 4 adjacent directions (up, down, left,right)
  public static final int[] ROW_DIRECTIONS = { -1, 1, 0, 0 };
  public static final int[] COL_DIRECTIONS = { 0, 0, -1, 1 };

  /**
   * Checks if a position is within the grid boundaries
   */
  private static boolean isValidPosition(int row, int col) {
    return 0 <= row && row < GRID_SIZE && 0 <= col && col < GRID_SIZE;
  }

  /**
   * Increment the value at the given position and its adjacent cells
   */
  public static void incrementNeighbours(int[][] grid, int row, int col, int increment) {
    // increment the current cell
    grid[row][col] += increment;

    // increment all valid adjacent cells
    for (int i = 0; i < 4; i++) {
      int newRow = row + ROW_DIRECTIONS[i];
      int newCol = col + COL_DIRECTIONS[i];

      if (isValidPosition(newRow, newCol)) {
        grid[newRow][newCol] += increment;

      }
    }
  }

  /**
   * Converts even numbers to 1 and odd numbers to 0 in the grid
   */
  public static void toggleCells(int[][] grid) {
    for (int row = 0; row < GRID_SIZE; row++) {
      for (int col = 0; col < GRID_SIZE; col++) {
        grid[row][col] = (grid[row][col] % 2 == 0) ? 1 : 0;
      }
    }
  }

  /**
   * Prints the grid to console
   */
  private static void printGrid(int[][] grid) {
    for (int row = 0; row < GRID_SIZE; row++) {
      for (int col = 0; col < GRID_SIZE; col++) {
        System.out.print(grid[row][col]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Read elements and process each cell
    int[][] grid = new int[GRID_SIZE][GRID_SIZE];
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        incrementNeighbours(grid, row, col, sc.nextInt());
      }
    }

    // Apply toggling and print result
    toggleCells(grid);
    printGrid(grid);

    sc.close();
  }

}
