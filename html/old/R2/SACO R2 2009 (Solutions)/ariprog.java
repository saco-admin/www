// SACO Second Round 2009
// Problem: Arithmetic Progression
// Author:  Julian Kenwood

import java.util.*;
class ariprog {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int[] seq = new int[100];
        int pos = 0;
        while(s.hasNextInt())
            seq[pos++] = s.nextInt();
        int best_len = 0, best_a = 0, best_d = 0, best_num = 0;
        for(int i = 0; i < pos; ++i) {
            for(int j = 0; j < pos; ++j) {
                int delta = seq[j] - seq[i];
                if(delta <= 0) continue;
                int cur = seq[j] + delta, cur_len = 2;
                while(true) {
                    boolean found = false;
                    for(int k = 0; k < pos; ++k)
                        if(seq[k] == cur) {
                            found = true;
                            break;
                        }
                    if(!found)
                        break;
                    cur_len++;
                    cur += delta;
                }
                if(cur_len > best_len) {
                    best_len = cur_len;
                    best_a = seq[i];
                    best_d = delta;
                    best_num = 1;
                } else if(cur_len == best_len) {
                    if(best_a > seq[i]) {
                        best_a = seq[i];
                        best_d = delta;
                    } else if(best_a == seq[i]) {
                        best_d = best_d > delta ? delta : best_d;
                    }
                    best_num++;
                }
            }
        }
        System.out.println("Arithmetic Progression Length = " + String.valueOf(best_len));
        System.out.println("Number of Arithmetic Progressions = " + String.valueOf(best_num));
        System.out.println("Arithmetic Progression First Term = " + String.valueOf(best_a));
        System.out.println("Arithmetic Progression Common Difference = " + String.valueOf(best_d));
    }
}
