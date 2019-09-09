/*
 * Java Solution to question "Triangle" from the
 * 2007 South African Computer Olympiad
 * Written by Carl Hultquist (chultquist@gmail.com)
 * Translated by
 * Donald Cook (Donald.H.Cook@gmail.com)
 */

import java.util.Scanner;  // Get Scanner class

class triangle
{
    public static void main (String[] args)
       {
       Scanner input = new Scanner(System.in);

       int a = input.nextInt();	// returns the first number as int
       int b = input.nextInt();	// returns the second number as int
       int c = input.nextInt();	// returns the third number as int

       if ((a == b) && (b == c))
          System.out.println( "EQUILATERAL" );
       else if ((a == b) || (b == c) || (c == a))
          System.out.println( "ISOSCELES" );
       else
          System.out.println( "SCALENE" );
       }   
}
