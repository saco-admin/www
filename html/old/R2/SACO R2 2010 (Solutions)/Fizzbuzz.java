import java.util.Scanner;

public class Fizzbuzz {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Count to what number? ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; ++i) {
            if (i % 15 == 0)
                System.out.println("fizzbuzz");
            else if (i % 5 == 0)
                System.out.println("buzz");
            else if (i % 3 == 0)
                System.out.println("fizz");
            else
                System.out.println(i);
        }
    }
}
