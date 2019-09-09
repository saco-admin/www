// SACO Second Round 2009
// Problem: Arithmetic Game
// Author:  Marco Gallotta

import java.io.*;
import java.util.*;
public class arigame {
  static Vector<Integer> nums = new Vector<Integer>();
  static TreeSet<Integer> ans = new TreeSet<Integer>();
  public static void solve(int count) {
    int n;
    for (int i = 0; i < nums.size(); i++)
      if (nums.get(i) != -1)
        for (int j = i+1; j < nums.size(); j++)
          if (nums.get(j) != -1)
            for (int op = 0; op < 2; op++) {
              if (op == 0) n = nums.get(i) + nums.get(j);
              else         n = nums.get(i) * nums.get(j);
              if (count == 2) {
                ans.add(n);
              } else {
                int tmp1 = nums.get(i), tmp2 = nums.get(j);
                nums.set(i, n);
                nums.set(j, -1);
                solve(count-1);
                nums.set(i, tmp1);
                nums.set(j, tmp2);
              }
            }
  }
  public static void main(String args[]) throws IOException {
    Scanner s = new Scanner(System.in);
    System.out.print("What numbers do you have? ");
    while (s.hasNextInt()) nums.add(s.nextInt());
    solve(nums.size());
    int count = 0, sum = 0;
    Iterator<Integer> it = ans.iterator();
    while (it.hasNext()) {
      count++;
      sum += it.next();
    }
    System.out.println("You can form " + count + " numbers");
    System.out.println("Their sum is " + sum);
  }
}
