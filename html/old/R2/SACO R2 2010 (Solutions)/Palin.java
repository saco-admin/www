import java.util.Scanner;

public class Palin {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        StringBuffer backwards = new StringBuffer(word);
        backwards.reverse();

        if (word.equals(backwards.toString()))
            System.out.println("Is a Palindrome");
        else
            System.out.println("Is Not a Palindrome");
    }
}
