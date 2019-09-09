// SACO 2nd Round 2009
// Problem: Unmarked calculator button
// Author:  Robert Ketteringham

import java.io.*;
class button {
    public static void main (String [] args) throws IOException {
        BufferedReader kb = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("First Number: ");
        int a = Integer.parseInt(kb.readLine());
        System.out.print("Second Number: ");
        int b = Integer.parseInt(kb.readLine());
        System.out.print("Answer: ");
        int answer = Integer.parseInt(kb.readLine());
        // Deciding  whether it is plus or times. Note that nested "if's" are also possible
        if (a + b == answer && a * b == answer)
            System.out.println("Either Plus or Times");
        else if (a + b == answer)
            System.out.println("Plus Only");
        else if (a * b == answer)
            System.out.println("Times Only");
        else
            System.out.println("Neither Plus nor Times");
        // Printing the two sums
        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "x" + b + "=" + (a*b));
    }
}
