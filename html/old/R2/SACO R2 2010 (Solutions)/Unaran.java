import java.util.Scanner;

public class Unaran {
    public static void main (String[] args) {
        System.out.print("How many letters in the message? ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // messages_with[n][k] is the number of messages of length n containing
        // a word of length k, and no longer words
        int messages_with[][] = new int[N+1][N+1];
        // messages_without[n][k] is the number of messages of length n containing
        // only words with less than k letters
        int messages_without[][] = new int[N+1][N+1];

        for (int n = 0; n <= N; ++n) {
            for (int k = 0; k <= N; ++k) {
                if (n == 0 && k == 0) {
                    messages_with[n][k] = 1;
                } else if (n >= k) {
                    // A message of length n with a word of length k is
                    // a message of length n-k (with or without a word of length
                    // k) plus a word of length k
                    messages_with[n][k] = messages_with[n-k][k] +
                                            messages_without[n-k][k];
                } else {
                    messages_with[n][k] = 0;
                }

                if (k > 0) {
                    // A message with words of length less than k either:
                    // * contains a word of length k-1, or
                    // * only contains words of length less than k-1
                    messages_without[n][k] = messages_with[n][k-1] +
                                                messages_without[n][k-1];
                } else {
                    messages_without[n][k] = 0;
                }

                messages_with[n][k] %= 10007;
                messages_without[n][k] %= 10007;
            }
        }

        System.out.println(messages_with[N][N] + messages_without[N][N]);
    }
}
