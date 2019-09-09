// SACO 2nd Round 2008
// Primes Paths Solution by Keegan Carruthers-Smith

import java.util.*;
import java.io.*;

public class primes {
    static boolean isPrime(int n) {
	for (int i = 2; i < n; i++)
	    if (n % i == 0)
		return false;
	return true;
    }

    static Vector<Integer> getPrimes(int digits) {
	Vector<Integer> primes = new Vector<Integer>();

	int low = (int)Math.pow(10, digits - 1);
	int upper = (int)Math.pow(10, digits);
	for (int i = low; i < upper; i++)
	    if (isPrime(i))
		primes.add(i);

	return primes;
    }

    static boolean oneChange(String a, String b) {
	int diff = 0;
	for (int i = 0; i < a.length(); i++)
	    if (a.charAt(i) != b.charAt(i))
		diff++;
	return diff == 1;
    }

    public static void main(String []args) throws Exception {
	BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("What number did Hannah start with? ");
	String startstr = bin.readLine().trim();
	int start = Integer.parseInt(startstr);
	System.out.print("What number does she want to end on? ");
	int end = Integer.parseInt(bin.readLine().trim());

	Vector<Integer> primes = getPrimes(startstr.length());
	int [] parent = new int [primes.lastElement()+1];

	LinkedList<Integer> q = new LinkedList<Integer>();
	q.add(start);
	parent[start] = -1;
	
	while (q.peek() != end) {
	    int cur = q.remove();
	    String curstr = Integer.toString(cur);

	    for (int i = 0; i < primes.size(); i++) {
		int p = primes.get(i);
		String pstr = Integer.toString(p);

		if (parent[p] == 0 && oneChange(curstr, pstr)) {
		    parent[p] = cur;
		    q.add(p);
		}
	    }
	}


	Vector<Integer> path = new Vector<Integer>();
	int cur = end;
	while (cur != -1) {
	    path.add(cur);
	    cur = parent[cur];
	}
	for (int i = path.size()-1; i >= 0; i--)
	    System.out.println(path.get(i));
    }
}
