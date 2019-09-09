// SACO Round 2 2007
// Solution by Marco Gallotta
import java.util.Scanner;

public class rooms {
    static int fill(int x, int y, int n, int store[][]) {
        int size = 0;
        if (store[x][y] == 1) {
            store[x][y] = n; 
            size = 1;
            for (int i = -1; i <= 1; i ++)
                for (int j = -1; j <= 1; j ++)
                    if (i != 0 ^ j != 0)
                        size += fill(x + i, y + j, n, store);
        }   
        return size;
    }  
   
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width:  ");
        int W = in.nextInt();
        System.out.print("Enter height: ");
        int H = in.nextInt();
        int store[][] = new int[H + 2][W + 2];
        for (int i = 0; i < W + 2; i++) { 
            store[0][i]     = 0;
            store[H + 1][i] = 0;
        }
        for (int i = 1; i < H + 1; i++) {
            store[i][0]     = 0;
            store[i][W + 1] = 0;
            System.out.print("Enter row: ");
            String line = in.next();
            for (int j = 1; j < W + 1; j++)
                store[i][j] = line.charAt(j - 1) == '0' ? 1 : 0;
        }   
       
        int n = 0, smallest = 1000000000, largest = 0;
        for (int x = 1; x < H + 1; x++)
            for (int y = 1; y < W + 1; y++)
                if (store[x][y] == 1) {
                    n++;
                    int size = fill(x, y, n + 1, store);
                    smallest = Math.min(smallest, size);
                    largest  = Math.max(largest,  size);
                }
   
        System.out.printf("Number of rooms: %d\n", n);
        System.out.printf("Smallest room:   %d\n", smallest);
        System.out.printf("Largest room:    %d\n", largest);
    }  
}
