// SACO 2nd Round 2009
// Problem: Robot Moves
// Author:  Robert Ketteringham
import java.io.*;
import java.lang.Math;

class robotmoves {
    public static void main (String [] args) throws IOException {
        BufferedReader kb=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter the width: ");
        int width=Integer.parseInt(kb.readLine());
        System.out.print("Enter the height: ");
        int height=Integer.parseInt(kb.readLine());
        System.out.println("Enter the initial instructions: ");
        String instructions = kb.readLine();
        int top = 0;
        int bottom = height - 1;
        int left = 0;
        int right = width - 1;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'd' && top < height - 1)
                top++;
            if (instructions.charAt(i) == 'd' && bottom < height - 1)
                bottom++;
            if (instructions.charAt(i) == 'u' && top > 0)
                top--;
            if (instructions.charAt(i) == 'u' && bottom > 0)
                bottom--;
            if (instructions.charAt(i) == 'r' && left < width - 1)
                left++;
            if (instructions.charAt(i) == 'r' && right < width - 1)
                right++;
            if (instructions.charAt(i) == 'l' && left > 0)
                left--;
            if (instructions.charAt(i) == 'l' && right > 0)
                right--;
        }
        if (bottom == top) //If it will always end up in the middle, then we don't need to move it to either of the sides
            bottom = 0;
        if (left == right)
            right = 0;
        int moves = Math.min(bottom, (height - top - 1)) + Math.min(right, (width - left - 1));
        System.out.println("You need to issue a further " + moves + " instructions");
    }
} 
