// SACO 2nd Round 2009
// Problem: Bar Graph
// Author:  Robert Ketteringham

import java.io.*;
class bargraph {
    public static void main (String [] args) throws IOException {
        BufferedReader kb = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        String number = kb.readLine();
        for (int i = 0; i < number.length(); i++) {
            System.out.print(number.charAt(i) + " ");
            for (int j = 0; j < number.charAt(i) - 48; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
