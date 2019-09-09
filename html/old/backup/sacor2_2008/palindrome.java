// SACO Second Round 2008
// Problem: Palindrome
// Author:  Marco Gallotta

import java.io.*;
import java.util.Scanner;
public class palindrome {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter N: ");
    int N = in.nextInt();
    int i;
    for (i = 0; i <= 100; i++) {
      int temp = N, rev = 0;
      while (temp > 0) {
        rev = rev * 10 + temp % 10;
        temp /= 10;
      }
      if (N == rev)
        break;
      N += rev;
    }
    if (i > 100)
      System.out.println("DOES NOT TERMINATE");
    else
      System.out.println(i + " " + N);
  }
}
