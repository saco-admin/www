/*
 * Solution to the problem "Cards" from the
 * 2007 South African Computer Olympiad
 *
 * Timothy Stranex <timothy.stranex@gmail.com>
 * 2007-04-25
 */

import java.util.*;
import java.io.*;

public class cards
{
    public static void main(String[] args)
        throws IOException
    {
        System.out.print("Enter the numbers of the cards: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = in.readLine().split("\\s");
        int N = parts.length;

        int[] cards = new int[N];
        for (int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(cards);

        int njokers = 0;
        for (int i=0; i<N; i++) {
            if (cards[i] == 0) {
                njokers++;
            }
        }

        int best = 0;
        if (njokers == N) {
            best = N;
        }

        // there is always a longest run starting on a non-joker card if there
        // is at least one non-joker card
        for (int i=njokers; i<N; i++) {
            int n = 1;
            int nj = 0;

            while(true) {
                if ((i+n-nj < N) && (cards[i+n-nj] == cards[i]+n)) {
                    n++;
                } else if (nj < njokers) {
                    n++;
                    nj++;
                } else {
                    break;
                }
            }

            best = Math.max(best, n);
        }

        System.out.println("The longest run has length " + best + ".");
    }
}
