import java.io.*;

public class L33t {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.print("Enter message: ");
        String message = br.readLine();

        char[] l33t = {'3', '1', '0', '9', '8'};
        char[] plain = {'E', 'L', 'O', 'G', 'B'};

        for (int i = 0; i < l33t.length; ++i) {
            message = message.replace(l33t[i], plain[i]);
        }

        System.out.println(message);
    }
}
