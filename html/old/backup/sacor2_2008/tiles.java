// SACO Second Round 2008
// Problem: Tiles
// Author: Timothy Stranex

import java.io.*;
public class tiles
{
    public static void main(String[] args)
        throws IOException
    {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter N: ");
       int N = Integer.parseInt(in.readLine());
       long[] W = new long[N+1];
       W[0] = 1;
       W[1] = 0;
       W[2] = 1;
       for (int i=3; i<=N; i++) {
           W[i] = (W[i-2] + W[i-3]) % 1007;
       }
       System.out.println(W[N]);
    }
}
