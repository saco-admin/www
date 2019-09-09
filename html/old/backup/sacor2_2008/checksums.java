// SACO Second Round 2008
// Problem: Checksums
// Author:  Marco Gallotta

import java.io.*;
import java.util.Scanner;
public class checksums {
    public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter credit card number: ");
	String cc = in.next();
	int sum = 0;
	for (int i = 0; i < cc.length(); i += 2)
	    sum += cc.charAt(i) - '0';
	for (int i = 1; i < cc.length(); i += 2) {
	    int dbl = (cc.charAt(i) - '0') * 2;
	    sum += dbl / 10 + dbl % 10;
	}
	
	if(sum % 10 == 0)
	    System.out.println(sum + " VALID");
	else
	    System.out.println(sum + " INVALID");
    }
}
