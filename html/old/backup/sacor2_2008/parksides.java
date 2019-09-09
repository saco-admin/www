// SACO Second Round 2008
// Problem: Parkside's Triangle
// Author:  Marco Gallotta

import java.io.*;
import java.util.Scanner;
public class parksides {
  public static void main(String args[]) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter N: ");
    int N = in.nextInt();
    System.out.print("Enter S: ");
    int S = in.nextInt();
    int tri[][] = new int[N][N];
    for (int i = 0; i < N; i++)
      for (int j = 0; j <= i; j++) {
        tri[j][i] = S;
        S++;
        if (S == 10)
          S = 1;
      }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < i; j++)
        System.out.print("  ");
      for (int j = i; j < N; j++)
        System.out.print(tri[i][j] + " ");
      System.out.println();
    }
  }
}
