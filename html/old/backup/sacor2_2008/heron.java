// SACO Second Round 2008
// Problem: Heron's Forumla
// Author:  Marco Gallotta

import java.io.*;
import java.util.Scanner;
public class herons {
  public static void main(String args[]) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = in.nextInt();
    System.out.print("Enter b: ");
    int b = in.nextInt();
    System.out.print("Enter c: ");
    int c = in.nextInt();
    double s = (a+b+c)/2.0;
    double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
    System.out.println(area);
  }
}
