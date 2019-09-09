 /*
  * Java Solution to question "Tee" from the
  * 2007 South African Computer Olympiad
  * Written by 
  * Donald Cook (Donald.H.Cook@gmail.com)
  */

import java.util.Scanner;  // Get Scanner class
class tee
{
  public static void main (String[] args)
  {
     Scanner input = new Scanner(System.in);
     int a = input.nextInt();  // returns the first numbers as int
         for( int j=1; j<=a; j++)  // Print top bar
           {
             System.out.print("t");
           }
         System.out.println();
         for(int i = 1; i<a; i++) // print leg in the middle of the bar
           {
              for( int k=1; k<=a/2; k++)
                 {
                   System.out.print(" ");
                 }
              System.out.println("t");	
           }
   }
}
