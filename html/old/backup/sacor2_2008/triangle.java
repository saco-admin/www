// SACO Second Round 2008
// Problem: Triangle
// Author:  Josh Yudaken

import java.io.*;
import java.util.Scanner;
public class triangle {
  public static void main(String args[]) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter N: ");
    int N = in.nextInt();
    for (int k=0; k<N; k++) {
        for (int j=0; j<k; j++) System.out.print("* ");
        System.out.println("*");
    }
  }
}
